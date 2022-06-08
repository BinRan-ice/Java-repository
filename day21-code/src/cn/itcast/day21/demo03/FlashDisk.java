package cn.itcast.day21.demo03;

import java.util.Objects;

public class FlashDisk implements IMobileStorage{
    private boolean isLocked;
    private HardDisk180405420 HD;

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public HardDisk180405420 getHD() {
        return HD;
    }

    public void setHD(HardDisk180405420 HD) {
        this.HD = HD;
    }

    @Override
    public String toString() {
        return "FlashDisk{" +
                "isLocked=" + isLocked +
                ", HD=" + HD +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlashDisk flashDisk = (FlashDisk) o;
        return isLocked == flashDisk.isLocked &&
                Objects.equals(HD, flashDisk.HD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLocked, HD);
    }

    public FlashDisk() {
    }

    public FlashDisk(boolean isLocked, HardDisk180405420 HD) {
        this.isLocked = isLocked;
        this.HD = HD;
    }

    @Override
    public void read() {
        if (this.isLocked){
            System.out.println("读取成功");
        }else{
            System.out.println("读取失败");
        }
    }

    @Override
    public void write() {
        if (this.isLocked){
            System.out.println("写入成功");
        }else{
            System.out.println("写入失败");
        }
    }
}
