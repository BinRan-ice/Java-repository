package cn.itcast.day09.demo09;

class Rectangle extends GeometricObject
{
    private double width;//宽
    private double length;//长

    Rectangle(String name,double length,double width)
    {
        super(name);
        this.width=width;
        this.length=length;
        this.Area=length*width;
        this.Perimeter=2*(length+width);
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public String toString()
    {
        return (super.toString()+"的长为"+length+"宽为"+width);
    }
    public double getArea()
    {
        return this.Area;
    }
    public double getPerimeter()
    {
        return this.Perimeter;
    }

}
