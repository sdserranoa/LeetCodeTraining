package org.example.GameOfLife289;

public class Solution {
    public static int[][] gameOfLife(int[][] board) {
        int[][] tempBoard = new int[board.length][board[0].length];
        var rows = board.length;
        var cols = board[0].length;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbors = calcNeighbors(board, i, j);
                if (board[i][j] == 1 && liveNeighbors>=2 && liveNeighbors<=3) {
                    tempBoard[i][j] = 1;
                } else if (board[i][j] == 1 && (liveNeighbors<2 || liveNeighbors>3)) {
                    tempBoard[i][j] = 0;
                } else if (board[i][j] == 0 && liveNeighbors == 3) {
                    tempBoard[i][j] = 1;
                }  else {
                    tempBoard[i][j] = 0;
                }
            }
        }
        System.arraycopy(tempBoard,0,board,0,tempBoard.length);
        return tempBoard;
    }

    public static int calcNeighbors(int[][] board, int i, int j) {
        int liveNeighbors = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (!(k >= board.length || k < 0) && !(l >= board[0].length || l < 0)) {
                    liveNeighbors += board[k][l];
                }
            }
        }

        if (board[i][j] == 1) {
            liveNeighbors--;
        }
        return liveNeighbors;
    }
}