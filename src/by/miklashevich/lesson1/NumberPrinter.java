package by.miklashevich.lesson1;

public class NumberPrinter {

    public static void main(String[] args) {

        int abcd = 9876;
        int d = abcd % 10;

        int abc = abcd / 10;
        int c = abc % 10;

        int ab = abc / 10;
        int b = ab % 10;

        int a = ab / 10;

        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

}








}