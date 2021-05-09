package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);

            SwitchArray.swap(data, index, i);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 10, 2, 500, 1};
        int[] sort = sort(arr);
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
