package by.miklashevich.lesson3;
public class Task3 {
    public static void main(String[] args) {
        int total = 0;
        int result = 0;
        for (int i = 1; i <= 256; i = i * 2) { //перебираем числа 1-256 с шагом i*2
            total = total + i; // суммируем текущее значение с предыдущим
        }
        System.out.println(total);
    }
}


