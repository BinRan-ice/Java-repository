package cn.itcast.day23.demo03.t_train_stop;

import java.util.Date;
import java.util.Objects;

/*
    封装Emp表数据的javaBean
 */
public class t_train_stop {
    private int train_id;
    private int stop_id;
    private String citr_name;
    private String station_name;
    private Date arrive_time;
    private int stop_time;
    private String mileage;

    @Override
    public String toString() {
        return "t_train_stop{" +
                "train_id=" + train_id +
                ", stop_id=" + stop_id +
                ", citr_name='" + citr_name + '\'' +
                ", station_name='" + station_name + '\'' +
                ", arrive_time=" + arrive_time +
                ", stop_time=" + stop_time +
                ", mileage=" + mileage +
                '}';
    }

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    public int getStop_id() {
        return stop_id;
    }

    public void setStop_id(int stop_id) {
        this.stop_id = stop_id;
    }

    public String getCitr_name() {
        return citr_name;
    }

    public void setCitr_name(String citr_name) {
        this.citr_name = citr_name;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public Date getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(Date arrive_time) {
        this.arrive_time = arrive_time;
    }

    public int getStop_time() {
        return stop_time;
    }

    public void setStop_time(int stop_time) {
        this.stop_time = stop_time;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        t_train_stop that = (t_train_stop) o;
        return train_id == that.train_id &&
                stop_id == that.stop_id &&
                stop_time == that.stop_time &&
                Objects.equals(citr_name, that.citr_name) &&
                Objects.equals(station_name, that.station_name) &&
                Objects.equals(arrive_time, that.arrive_time) &&
                Objects.equals(mileage, that.mileage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(train_id, stop_id, citr_name, station_name, arrive_time, stop_time, mileage);
    }
}
