package cn.itcast.day09.demo05;

public class Circle extends GeometricObject{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public void Area() {
        super.setArea(r*r*Math.PI);
        System.out.println("圆形的面积为："+super.getArea());
    }

    @Override
    public void Lang() {
        super.setLang( 2*Math.PI*r);
        System.out.println("圆形的周长为："+super.getLang());
    }

}
