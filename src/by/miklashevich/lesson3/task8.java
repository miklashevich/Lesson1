package by.miklashevich.lesson3;

public class task8 {

    public static void main(String[] args) {

     int n = 9; // переменной n задаем число, факториал которого нужно найти
     int res = 1; // задаем переменную res
     for (int i= 1; i <= n; i++) { // цикл до значениея n c шагом +1

         res = res * i; // каждый цикл прошлый результат умножается на текущий

     }

        System.out.println(res);


    }
}
