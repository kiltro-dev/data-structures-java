package com.datastructures;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }

        // char[][] boardTwo = { { 'o', 'e' }, { 'a', 'i' } };

        char[][] boardTwo = new char[][] { new char[] { '0', '-', '-' }, new char[] { '0', '-', '-' },
                new char[] { '0', '-', '-' }, };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
