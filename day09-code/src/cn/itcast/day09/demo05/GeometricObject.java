package cn.itcast.day09.demo05;

public abstract class GeometricObject {
    private double area;
    private double lang;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLang() {
        return lang;
    }

    public void setLang(double lang) {
        this.lang = lang;
    }

    public abstract String toString();

    public abstract void Area();

    public abstract void Lang();
}
