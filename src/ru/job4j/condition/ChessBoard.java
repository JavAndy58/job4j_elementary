package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int calculX = Math.abs(x2 - x1);
        int calculY = Math.abs(y2 - y1);

        if (calculX == calculY) {
            boolean start = x1 >= 0 && x1 <= 7 && x2 >= 0 && x2 <= 7 &&
                    y1 >= 0 && y1 <= 7 && y2 >= 0 && y2 <= 7;
            rsl = start ? calculX : 0;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(7, 0, 0, 7));
    }
}
