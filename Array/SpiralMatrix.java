/*
 * PROBLEM: Spiral Matrix
 * STATEMENT: Aapko ek $m \times n$ ka 2D matrix diya hai. Aapko us matrix ke saare elements ko spiral order (ghoomte hue, clockwise direction mein) print ya return karna hai, yaani sabse pehle top row left-to-right, fir right column top-to-bottom, fir bottom row right-to-left, aur fir left column bottom-to-top, aur yahi cycle andar ke elements ke liye repeat hogi.
 * EXAMPLE: arr = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 * Output: 1 2 3 6 9 8 7 4 5
 * (Explanation: Jaisa ki spiral pattern hota hai, pehle bahar ki boundary [1->2->3->6->9->8->7->4] cover hui, aur fir andar ghoom kar bacha hua element [5] print hua.)
 */

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralMatrix ( arr );
    }

    public static void spiralMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            //right move
            for (int i = left ; i <= right ; i++) {
                System.out.print ( arr[top][i] + " " );
            }
            top++;

            //bottom move
            for (int i = top ; i <= bottom ; i++) {
                System.out.print ( arr[i][right] + " " );
            }
            right--;

            //left move
            if (top <= bottom) {
                for (int i = right ; i >= left ; i--) {
                    System.out.print ( arr[bottom][i] + " " );
                }
                bottom--;
            }

            //up move
            if (left <= right) {
                for (int i = bottom ; i >= top ; i--) {
                    System.out.print ( arr[i][left] + " " );
                }
                left++;
            }
        }
    }
}
