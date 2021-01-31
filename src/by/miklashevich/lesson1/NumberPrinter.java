package by.miklashevich.lesson1;

public class NumberPrinter {

    public static void main(String[] args) {
        int x = 9876;

        System.out.println((x %100-((x % 100/10)*10))*1000+((x % 100/10)*100)+((x % 1000/100)*10)+(x/1000));



}
}