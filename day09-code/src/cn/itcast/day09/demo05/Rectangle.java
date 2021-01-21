package cn.itcast.day09.demo05;

public class Rectangle extends GeometricObject{
    private double l;
    private double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public Rectangle() {
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", w=" + w +
                '}';
    }

    @Override
    public void Area() {
        super.setArea(l*w);
        System.out.println("矩形的面积为："+super.getArea());
    }

    @Override
    public void Lang() {
        super.setLang((2*l)+(2*w));
        System.out.println("矩形的周长为："+super.getLang());
    }
}
