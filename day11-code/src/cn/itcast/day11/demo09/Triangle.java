package cn.itcast.day11.demo09;

class Triangle extends Point
{

    public Triangle(Point point1,Point point2,Point point3) {
        if(point1.x/point1.y==point2.x/point2.y&&point2.x/point2.y==point3.x/point3.y)
            throw new IllegalArgumentException("Triangle无效参数异常");
    }
}

