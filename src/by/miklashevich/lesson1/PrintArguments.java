package by.miklashevich.lesson1;

public class PrintArguments {
    public static void main(String[ ] args) {
    for (String str : args) {
        System.out.printf("Aргумент-> %s%n", str);
    }
}
}
