package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int surrender = money - price;

        for (int i : coins) {
            while (surrender - i  >= 0) {
                rsl[size] = i;
                surrender -= i;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] arr = change(50, 15);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
