package by.miklashevich.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int array [][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        int s = 0;

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (i == j) {
                    s += array[i][j];
                }
            }
        }

        System.out.println(s);
    }
}
