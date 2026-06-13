/*
 * PROBLEM: Kth Largest Element in an Array
 * STATEMENT: Ek unsorted integers ka array 'nums' aur ek integer 'k' diya hai.
 * Aapko is array ka 'k'-th sabse bada (largest) element return karna hai.
 * Note: Aapko sorted order ka k-th element nikalna hai, unique elements ka nahi.
 * EXAMPLE: nums = [3, 2, 1, 5, 6, 4], k = 2 -> Output: 5
 * (Kyunki agar sort karein toh [1, 2, 3, 4, 5, 6] banega, aur dusra sabse bada 5 hai)
 */

import java.util.PriorityQueue;

public class KthLargestInArray {
    public static void main(String[] args) {
        int[] num = {3, 2, 1, 5, 6, 4};
        int k = 3;

        int answer = kthLargest ( num, k );
        System.out.println ( "Required element: " + answer );
    }

    public static int kthLargest(int[] num, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<> ();

        for (int n : num) {
            queue.add ( n );

            if (queue.size () > k) {
                queue.poll ();
            }
        }

        return queue.peek ();
    }
}
