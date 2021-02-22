package by.miklashevich.lessson5.task1;

public class Time {
    public int sec;
    public int min;
    public int hour;

    public Time(int sec, int min, int hour ) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Time{" +
                "sec=" + sec +
                ", min=" + min +
                ", hour=" + hour +
                '}';
    }




}


