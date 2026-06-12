/*
 * PROBLEM: N-Queens
 * STATEMENT: Ek N x N size ka chessboard diya hai. Aapko uspar 'N' queens ko is tarah se bithana hai ki koi bhi do queens ek dusre par attack na kar sakein.
 * Ek queen horizontally, vertically, aur diagonally attack kar sakti hai. Aapko saare valid board configurations return karne hain.
 * EXAMPLE: N = 4
 * Output: [[".Q..", "...Q", "Q...", "..Q."], ["..Q.", "Q...", "...Q", ".Q.."]]
 */

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens ( n );

        System.out.println ( "total solution for " + n + "-Queens: " + solutions.size () );
        System.out.println ( "Configurations: " + solutions );
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<> ();

        char[][] board = new char[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                board[i][j] = '.';
            }
        }

        backtrack ( 0, board, result );
        return result;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> result) {
        if (row == board.length) {
            result.add ( constructBoard ( board ) );
            return;
        }

        for (int col = 0 ; col < board.length ; col++) {
            if (isSafe ( board, row, col )) {
                board[row][col] = 'Q';
                backtrack ( row + 1, board, result );
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0 ; i < row ; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1 ; i >= 0 && j >= 0 ; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1 ; i >= 0 && j < board.length ; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private static List<String> constructBoard(char[][] board) {
        List<String> currentConfiguration = new ArrayList<> ();
        for (int i = 0 ; i < board.length ; i++) {
            currentConfiguration.add ( new String ( board[i] ) );
        }
        return currentConfiguration;
    }
}
