package by.miklashevich.lesson3;

public class task2 {

    public static void main(String[] args) {

        int[] numbers = {10, 2, 7, 101, 83, 53, 1, 64, 67, 8, 94, 15, 20};

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.print(" отсортированный массив ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
