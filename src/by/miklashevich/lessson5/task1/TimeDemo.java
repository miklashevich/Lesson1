package by.miklashevich.lessson5.task1;

public class TimeDemo {
    public static void main(String[] args) {
        Time t = new Time (28, 0, 0);
        System.out.println(t);
        int sum = TimeService.countSec(15,34,1);
        System.out.println(sum);
        TimeSec timeSec = new TimeSec(30);
        System.out.println(timeSec);
    }


}
