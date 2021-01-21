package cn.itcast.day09.demo08;

public class StopTrick implements calculate{
    private int stoptrick;

    public StopTrick() {
    }

    @Override
    public int Free(double x) {
        stoptrick=(int)x*4;
        return stoptrick;
    }
}
