package by.miklashevich.lesson3;

public class task4 {
    public static void main(String[] args) {


        int a = 5;
        int b = 7;
        int total = a; // заводим переменную = a
        for (int i = 1; i < b; i++) { //создаем цикл с кол-вом повторений = b

            total = total + a; // суммируем число а друг с другом


        }
        System.out.println( total);
    }


}
