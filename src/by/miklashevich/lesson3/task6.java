package by.miklashevich.lesson3;

public class task6 {
    public static void main(String[] args) {

        double percent = 1.1; // задаем переменную равную проценту увеличения бега в день
        double d = 10; // прошел в первый день
        double result = d; // суммарное расстояние

        for (int i = 2; i <= 7; i++) { // цикл с шагом 1, до 7
           d = d * percent; // прошел в i день
            result = result + d; // суммарно прошел за i дней

        }
        System.out.println(result);
        }
}
