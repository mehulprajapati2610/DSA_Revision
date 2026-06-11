/*
 * PROBLEM: Set Matrix Zeroes
 * STATEMENT: Aapko ek $m \times n$ ka integer matrix 'matrix' diya hai. Agar is matrix mein koi element 0 hai, toh aapko us pure element ke ROW (panti) aur COLUMN (stambh) ke saare elements ko 0 set karna hai. Yeh poora badlav aapko in-place (usi matrix ke andar) karna hai.
 * EXAMPLE: matrix = [[1, 0, 1], [1, 1, 1], [0, 1, 1]]
 * Output: [[0, 0, 0], [0, 0, 1], [0, 0, 0]]
 * (Explanation: Index (0, 1) par 0 hone ki wajah se poori 0th row aur 1st column 0 ho jayenge, aur index (2, 0) par 0 hone ki wajah se poori 2nd row aur 0th column 0 ho jayenge.)
 */

import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 1}, {1, 1, 1}, {0, 1, 1}};
        setZeroes ( arr );
        System.out.println ( Arrays.deepToString ( arr ) );
    }

    public static void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0 ; i < n ; i++) {
            if (arr[0][i] == 0) firstRowZero = true;
        }

        for (int i = 0 ; i < m ; i++) {
            if (arr[i][0] == 0) firstColZero = true;
        }

        for (int i = 1 ; i < m ; i++) {
            for (int j = 1 ; j < n ; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for (int i = 1 ; i < m ; i++) {
            for (int j = 1 ; j < n ; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int i = 0 ; i < n ; i++) {
                arr[0][i] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0 ; i < m ; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
