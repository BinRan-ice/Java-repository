package cn.itcast.day09.demo09;

import java.lang.*;
public class ComparableTriangle extends Triangle implements Comparable
{

    public ComparableTriangle(String name,double a,double b,double c)
    {
        super(name,a,b,c);
    }

    @Override
    public int compareTo(Object o)
    {

        if(this.Area<((ComparableTriangle)o).Area)
            return -1;
        if(this.Area==((ComparableTriangle)o).Area)
            return 0;
        else
            return 1;
    }

    @Override
    public String toString()
    {
        return "triangle [a="+getA()+" b="+getB()+" =c"+getC()+"  Area="+Area+"]";
    }
}
