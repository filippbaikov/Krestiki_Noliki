package com.company;

public class XO {
    public static final char DOT_EMPTY='*';
    public static final char DOT_O='O';
    public static final char DOT_X='X';
    public static final int SIZE=3;
    public static final int DOTS_TO_WIN=3;
    public static  char MAP[][];

    public static void main(String[] args) {


    }
    private static void map() {
        MAP = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;

            }

        }
    }
}