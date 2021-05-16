package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int i = 0, j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if (i > left.length - 1) {
                rsl[k] = right[j];
                j++;
            } else if (j > right.length - 1) {
                rsl[k] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                rsl[k] = left[i];
                i++;
            } else {
                rsl[k] = right[j];
                j++;
            }
        }

        return rsl;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 100};
        int[] array2 = {1, 3, 50, 5, 1200};
        int[] result = merge(array1, array2);
        for (int i: result) {
            System.out.print(i + " ");
        }
    }
}
