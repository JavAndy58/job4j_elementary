package ru.job4j.condition;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        isEven(6);
        isPositive(10);
        notEven(20);
        notPositive(20);
        notEvenAndPositive(15);
        evenOrNotPositive(6);
    }
}
