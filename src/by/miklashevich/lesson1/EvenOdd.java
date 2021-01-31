package by.miklashevich.lesson1;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        n = 98887;

        if (n/100>=1 & n/100<=9) {
            System.out.println(n + " Трехзначное число");
        } else {
            System.out.println(n + " - Число не трехзначное");
        }

        if(n%2==0) {
            System.out.println(n+" - Четное число");
        } else {
            System.out.println(n+" - Нечетное число");
        }

        if(n%10!=0) {
            System.out.println(n+" - последнее число 7");
        } else {
            System.out.println(n+" - последнее число не 7");
        }


        }
}





