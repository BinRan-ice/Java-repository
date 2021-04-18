package cn.itcast.day11.demo09;

class Polygon extends Point
{ int i=0;
    public Polygon(Point[] points)
    { i=points.length;
        if(i<=2)
            throw new IllegalArgumentException("Polygon无效参数异常");
    }

}