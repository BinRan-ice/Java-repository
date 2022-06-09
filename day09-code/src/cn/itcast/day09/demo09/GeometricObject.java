package cn.itcast.day09.demo09;

abstract class  GeometricObject
{
    private String name;
    public double Area;
    public double Perimeter;
    GeometricObject(String name)//构造函数
    {
        this.name=name;
        this.Area=0;
        this.Perimeter=0;
    }
    public String toString()
    {
        return name;
    }
    public abstract double getArea();//抽象函数计算面积、周长
    public abstract double getPerimeter();
}