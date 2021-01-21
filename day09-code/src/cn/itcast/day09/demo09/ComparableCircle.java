package cn.itcast.day09.demo09;

import java.lang.*;
class ComparableCircle extends Circle implements Comparable
{
    public ComparableCircle(String name,double radius)
    {
        super(name,radius);
    }

    @Override
    public int compareTo(Object o)
    {
        if(this.Area<((ComparableCircle)o).Area)
            return -1;
        if(this.Area==((ComparableCircle)o).Area)
            return 0;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "circle [radius="+getRadius()+", Area="+Area+"]";
    }
}