package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int temp = array[i][j];
                rsl += temp;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {5, 10, 100},
                {1, 2, 100}
        };
        System.out.println("Сумма " + sum(arr));
    }
}
