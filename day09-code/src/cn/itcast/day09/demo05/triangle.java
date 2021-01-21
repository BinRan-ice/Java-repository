package cn.itcast.day09.demo05;

public class triangle extends GeometricObject {
    private double s1, s2, s3;

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public triangle() {
    }

    public triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return "triangle{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                '}';
    }

    public void calc() {
        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1) && (s1 - s2 < s3) && (s1 - s3 < s2) && (s2 - s3 < s1) && (s2 - s1 < s3) && (s3 - s1 < s2) && (s3 - s2 < s1)) {
            super.setArea(0.25 * (Math.sqrt(((s1 + s2 + s3) * (s1 + s2 - s3) * (s1 + s3 - s2) * (s2 + s3 - s1)))));
            super.setLang(s1 + s2 + s3);
            System.out.println("三角形的面积为：" + super.getArea());
            System.out.println("三角形的周长为：" + super.getLang());
        } else {
            System.out.println("输入的三条边无法构成三角形！！！");
            return;
        }
    }

    @Override
    public void Area() {
        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1) && (s1 - s2 < s3) && (s1 - s3 < s2) && (s2 - s3 < s1) && (s2 - s1 < s3) && (s3 - s1 < s2) && (s3 - s2 < s1)) {
            super.setArea(0.25 * (Math.sqrt(((s1 + s2 + s3) * (s1 + s2 - s3) * (s1 + s3 - s2) * (s2 + s3 - s1)))));
            System.out.println("三角形的面积为：" + super.getArea());
        } else {
            System.out.println("输入的三条边无法构成三角形！！！");
            return;
        }
    }

    @Override
    public void Lang() {
        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1) && (s1 - s2 < s3) && (s1 - s3 < s2) && (s2 - s3 < s1) && (s2 - s1 < s3) && (s3 - s1 < s2) && (s3 - s2 < s1)) {
            super.setLang(s1 + s2 + s3);
            System.out.println("三角形的周长为：" + super.getLang());
        } else {
            System.out.println("输入的三条边无法构成三角形！！！");
            return;
        }
    }
}
