package cn.itcast.day09.demo09;

class Circle extends GeometricObject
{
    private double radius;//半径
    Circle(String name,double radius)
    {
        super(name);
        this.radius=radius;
        this.Area=Math.PI*radius*radius;
        this.Perimeter=2*Math.PI*radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return (super.toString()+"的半径为"+radius);
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