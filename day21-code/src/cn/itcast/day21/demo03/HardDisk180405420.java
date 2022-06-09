package cn.itcast.day21.demo03;

import java.util.Objects;
import java.util.Scanner;

public class HardDisk180405420 implements IMobileStorage{
    private String ColumnName;

    public HardDisk180405420() {
    }

    public HardDisk180405420(String columnName) {
        ColumnName = columnName;
    }

    @Override
    public String toString() {
        return "HardDisk180405420{" +
                "ColumnName='" + ColumnName + '\'' +
                '}';
    }

    public String getColumnName() {
        return ColumnName;
    }

    public void setColumnName(String columnName) {
        ColumnName = columnName;
    }

    @Override
    public void read() {
        System.out.println(this.getColumnName());
    }

    @Override
    public void write() {
        Scanner sc=new Scanner((System.in));
        this.ColumnName=sc.next();
    }
}
