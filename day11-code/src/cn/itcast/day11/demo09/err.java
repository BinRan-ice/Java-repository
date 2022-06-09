package cn.itcast.day11.demo09;

public class err {
    public static void main(String[] args) throws IllegalArgumentException {
        Point point1 = new Point(25, 1);
        Point point2 = new Point(46, 2);
        Point point3 = new Point(9, 3);
        new Rectangle(point1, 12, 3);
        new Triangle(point1, point2, point3);
        Point[] point = {point1, point2};
        new Polygon(point);
    }

}
