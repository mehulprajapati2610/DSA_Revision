import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3};
        int k = 2;
        System.out.println ( "top " + k + " elements : " + Arrays.toString ( topKFrequent ( nums, k ) ) );
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        for (int n : nums) {
            map.put ( n, map.getOrDefault ( n, 0 ) + 1 );
        }

        PriorityQueue<Integer> heap = new PriorityQueue<> ( (a, b) -> map.get ( a ) - map.get ( b ) );

        for (int n : map.keySet ()) {
            heap.add ( n );
            if (heap.size () > k) {
                heap.poll ();
            }
        }

        int[] result = new int[k];
        for (int i = 0 ; i < k ; i++) {
            result[i] = heap.poll ();
        }
        return result;
    }
}
