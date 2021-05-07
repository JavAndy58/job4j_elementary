package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;

        if (left[left.length - 1] == right[right.length - 1]) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[] {10, 20, 30, 50};
        int[] array2 = new int[] {25, 50};

        System.out.println(check(array1, array2));
     }
}