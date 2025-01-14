package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {100, 70, 25, 50, 10, 5, 0};
        System.out.println(findMin(arr, 1, 5));
    }
}
