package cn.itcast.day09.demo09;

import java.util.Comparator;

public class AreaComparator implements Comparator<GeometricObject>
{
    @Override
    public int compare(GeometricObject o1, GeometricObject o2)
    {
        if (o1.getArea() <o2.getArea())
            return -1;
        if (o1.getArea() == o2.getArea())
            return 0;
        else
            return 1;
    }
}
