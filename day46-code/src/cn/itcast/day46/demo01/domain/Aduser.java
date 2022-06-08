package cn.itcast.day46.demo01.domain;

public class Aduser {
    private String adusername;
    private String adpassword;

    @Override
    public String toString() {
        return "Aduser{" +
                "adusername='" + adusername + '\'' +
                ", adpassword='" + adpassword + '\'' +
                '}';
    }

    public String getAdusername() {
        return adusername;
    }

    public void setAdusername(String adusername) {
        this.adusername = adusername;
    }

    public String getAdpassword() {
        return adpassword;
    }

    public void setAdpassword(String adpassword) {
        this.adpassword = adpassword;
    }
}
