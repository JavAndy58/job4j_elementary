package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] numbers = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[][] arr = multiple(9);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
