/*
 * PROBLEM: K Closest Points to Origin
 * STATEMENT: Aapko X-Y plane par kuch 'points' ka ek 2D array diya hai, jahan points[i] = [xi, yi] hai, aur ek integer 'k' diya hai.
 * Aapko origin (0, 0) se sabse PAAS (closest) wale 'k' points return karne hain.
 * Do points ke beech ki doori Euclidean Distance formula se nikali jati hai: √(x² + y²).
 * EXAMPLE: points = [[1,3], [-2,2]], k = 1 -> Output: [[-2,2]]
 * (Kyunki (1,3) ki doori √10 hai aur (-2,2) ki doori √8 hai. √8 chota hai, isliye (-2,2) paas hai)
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoint {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;

        int[][] output = kClosest ( points, k );

        System.out.println ( "Answer: " + Arrays.deepToString ( output ) );
    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<> ( (a, b) -> ( b[0] * b[0] + b[1] * b[1] ) - ( a[0] * a[0] + a[1] * a[1] ) );

        for (int[] point : points) {
            maxHeap.add ( point );

            if (maxHeap.size () > k) {
                maxHeap.poll ();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0 ; i < k ; i++) {
            result[i] = maxHeap.poll ();
        }
        return result;
    }
}
