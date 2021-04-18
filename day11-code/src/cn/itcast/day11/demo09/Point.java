package cn.itcast.day11.demo09;

class Point
{ public Point() {};
    public int x;
    public int y;
    public Point(int x,int y)
    { this.x=x;
        this.y=y;

        if(x<0||y<0)
            throw new IllegalArgumentException("Point中无效参数异常");
    }
}

