package by.miklashevich.lesson1;

public class FourDigitNumber {
    public static void main(String[] args) {
        int abcd = 1231;
        int d = abcd % 10;

        int abc = abcd / 10;
        int c = abc % 10;

        int ab = abc / 10;
        int b = ab % 10;

        int a = ab / 10;

        if (a == b && b == c && c == d) {
            System.out.println(" все числа равны");
        } else {
            System.out.println(" все числа не равны");
        }




    }
    }
