package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println(indexOf(arr, 8));
        System.out.println(indexOf(arr, 1000));
    }
}
