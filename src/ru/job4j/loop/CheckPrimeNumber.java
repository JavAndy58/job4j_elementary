package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number > 2) {
            for (int i = 1; i < number; i++) {
                if (i > 1 && number % i == 0) {
                    prime = false;
                    break;
                }
            }
        } else {
            prime = false;
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
        System.out.println(check(6));
        System.out.println(check(1));
    }
}
