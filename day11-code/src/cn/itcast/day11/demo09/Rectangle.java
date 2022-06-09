package cn.itcast.day11.demo09;

class Rectangle extends Point
{
    public int length,width;
    public Rectangle(Point point1,int length,int width) {
        this.length=length;
        this.width=width;
        if(length<0||width<0)
            throw new IllegalArgumentException("Rectangle无效参数异常");
    }
}
