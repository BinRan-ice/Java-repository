package cn.itcast.day09.demo08;

public class MoiveTrick implements calculate {
    private int moviceTicket;

    public MoiveTrick() {

    }

    public int getMoviceTicket() {
        return moviceTicket;
    }

    public void setMoviceTicket(int moviceTicket) {
        this.moviceTicket = moviceTicket;
    }

    public MoiveTrick(int moviceTicket) {
        this.moviceTicket = moviceTicket;
    }

    @Override
    public int Free(double x) {
        return moviceTicket;
    }
}
