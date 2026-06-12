/*
 * PROBLEM: Word Search
 * STATEMENT: Ek m x n characters ka board (2D grid) aur ek string 'word' diya hai.
 * Aapko check karna hai ki kya wo 'word' grid ke characters ko jodkar banaya ja sakta hai.
 * Shuruat kisi bhi cell se ho sakti hai, aur hum horizontally ya vertically 4-directions mein move kar sakte hain.
 * Lekin ek condition hai: Ek single cell ke character ko ek hi word path mein DOBARA use nahi kiya ja sakta.
 * EXAMPLE: board = [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ], word = "ABCCED" -> Output: true
 */

public class Word {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "SFDECC";

        boolean result = exist ( board, word );

        System.out.println ( "Exist? " + result );
    }

    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                if (board[i][j] == word.charAt ( 0 )) {
                    if (dfs ( i, j, 0, board, word )) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean dfs(int r, int c, int index, char[][] board, String word) {
        if (index == word.length ()) {
            return true;
        }

        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt ( index )) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#';

        boolean wordFound = dfs ( r + 1, c, index + 1, board, word ) ||
                dfs ( r - 1, c, index + 1, board, word ) ||
                dfs ( r, c + 1, index + 1, board, word ) ||
                dfs ( r, c - 1, index + 1, board, word );

        board[r][c] = temp;

        return wordFound;
    }
}
