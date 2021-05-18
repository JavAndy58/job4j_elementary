package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int num1, int num2, int num3) {
        return max(max(num1, num2), num3);
    }

    public static int max(int num1, int num2, int num3, int num4) {

        return max(max(max(num1, num2), num3), num4);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(50, 500));
        System.out.println(Max.max(10, 100, 1000));
        System.out.println(Max.max(1, 10, 100, 2000));
    }
}