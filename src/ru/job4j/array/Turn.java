package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 -i] = temp;
            }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {12, 10, 8, 6, 4, 2, 0};
        int[] str = back(arr);
        for(int i: str){
            System.out.print(i + " ");
        }
    }
}
