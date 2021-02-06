package by.miklashevich.lesson2;

public class task4 {

    public static void main(String[] args) {
        int number = 4367;
        int temp = number;
        int count = 0;

        while (temp > 0) {
            temp = temp / 10;
            count = count + 1;
        }
        int array[] = new int[count];

        temp = number;
        int result = 0;
        int index = 0;
        while (temp > 0) {
            int n = temp % 10;
            temp = temp / 10;
            array[index] = n;
            index = index + 1;

        }

        for(int i = 0; i < array.length; i++) {
        }
        int printNumber = 0;
        for (int z = 0; z < array.length; z++ ) {
            printNumber = printNumber + (int) (array[z] * Math.pow(10, count - 1));
            count--;

        }
        System.out.println(printNumber);


    }
}