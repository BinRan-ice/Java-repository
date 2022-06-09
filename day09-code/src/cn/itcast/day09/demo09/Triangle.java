package cn.itcast.day09.demo09;

class Triangle extends GeometricObject
{
    private double a;
    private double b;
    private double c;

    Triangle(String name,double a,double b,double c)
    {
        super(name);
        this.a=a;
        this.b=b;
        this.c=c;
        double p=(a+b+c)/2;
        this.Area=Math.sqrt(p * (p - a) * (p - b) * (p - c));
        this.Perimeter=a+b+c;;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }

    public String toString()
    {
        return (super.toString()+"的三边长分别为"+a+","+b+","+c);
    }

    public double getArea()
    {
        return  this.Area;//海伦公式计算三角形面积

    }
    public double getPerimeter()
    {
        return this.Perimeter;
    }
}
