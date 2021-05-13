package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] arr1 = new char[] {'H', 'e', 'l', 'p'};
        char[] arr2 = new char[] {'H', 'e'};
        System.out.println(startsWith(arr1, arr2));
    }
}
