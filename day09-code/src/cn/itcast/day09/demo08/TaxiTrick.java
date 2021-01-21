package cn.itcast.day09.demo08;

public class TaxiTrick implements calculate{
    private double kio;
    private int free;
    public TaxiTrick(int kio) {
        this.kio = kio;
    }

    public double getKio() {
        return kio;
    }

    public void setKio(double kio) {
        this.kio = kio;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public TaxiTrick() {
    }

    @Override
    public int Free(double x) {
        if (kio<=3){
            free=8;
            return free;
        }else{
            int f= (int) ((kio-3)/0.8);
            free=8+f;
            return free;
        }
    }
}
