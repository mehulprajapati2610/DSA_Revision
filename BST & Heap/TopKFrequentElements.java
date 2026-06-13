/*
 * PROBLEM: Top K Frequent Elements
 * STATEMENT: Ek integer array 'nums' aur ek integer 'k' diya hai.
 * Aapko un 'k' elements ka array return karna hai jo array mein SABSE ZYADA BAAR (most frequent) aaye hain.
 * Output ka order kuch bhi ho sakta hai.
 * EXAMPLE: nums = [1, 1, 1, 2, 2, 3], k = 2 -> Output: [1, 2]
 * (Kyunki '1' teen baar aaya hai, '2' do baar aaya hai, aur '3' ek baar. Top 2 frequent elements 1 aur 2 hain)
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] output = topKFrequent ( nums, k );

        System.out.println ( "top " + k + " frequent elements are " + Arrays.toString ( output ) );
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<> ();

        for (int n : nums) {
            map.put ( n, map.getOrDefault ( n, 0 ) + 1 );
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<> ( (a, b) -> map.get ( a ) - map.get ( b ) );

        for (int n : map.keySet ()) {
            minHeap.add ( n );

            if (minHeap.size () > k) {
                minHeap.poll ();
            }
        }

        int[] result = new int[k];
        for (int i = 0 ; i < k ; i++) {
            result[i] = minHeap.poll ();
        }

        return result;
    }
}
