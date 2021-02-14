package by.miklashevich.lesson3;

public class task8 {

    public static void main(String[] args) {
        int x = 10; // задаем переменную х равную числу по условию
        int n = 15; // переменной n задаем число, факториал которого нужно найти
        int res = 1; // задаем переменную res
        for (int i= x; i <= n; i++) { // цикл до значениея n c шагом +1

         res = res * i; // каждый цикл прошлый результат умножается на текущий

     }

        System.out.println(res);


    }
}
