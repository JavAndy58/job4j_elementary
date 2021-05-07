package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[5];
        names[0] = "Petr Arsentev";
        names[1] = "Ivan Ivanov";
        names[2] = "Oleg Petrov";
        names[3] = "Igor Savinov";
        names[4] = "Andrey Ivanov";

        System.out.println("Размер массива ages " + ages.length);
        System.out.println("Размер массива surnames " + surnames.length);
        System.out.println("Размер массива prices" + prices.length);
        System.out.println();
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
    }
}
