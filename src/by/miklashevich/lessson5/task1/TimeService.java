package by.miklashevich.lessson5.task1;

public class TimeService {
    public static  int countSec(int sec, int min, int hour){
        int sum = ((3600 * hour) + (60 * min) + sec);
        return sum;

    }


}


