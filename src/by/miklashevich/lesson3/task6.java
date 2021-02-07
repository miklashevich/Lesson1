package by.miklashevich.lesson3;

public class task6 {
    public static void main(String[] args) {


        double d = 10; // прошел в первый день
        double result = d; // суммарное расстояние

        for (int i = 2; i <= 7; i++) { // цикл с шагом 1, до 7
           d = d * 1.1; // прошел в i день
            result = result + d; // суммарно прошел за i дней

        }
        System.out.println(result);
        }
}
