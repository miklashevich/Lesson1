package by.miklashevich.lessson5.task1;

public class TimeSec {
    public int second;

    public TimeSec(int second) {

        this.second = second;
    }

    @Override
    public String toString() {
        return "TimeSec{" +
                "sec=" + second +
                '}';
    }
}
