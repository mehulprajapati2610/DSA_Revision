import java.util.HashMap;

public class SubarraysSumEqualsK {
    public static void main(String[] args) {
        int[] num = {3, 4, 7, 2, -3};
        int k = 7;
        System.out.println ( "Answer is " + sumCount ( num, k ) );
    }

    public static int sumCount(int[] num, int k) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        map.put ( 0, 1 );
        int currentSum = 0;
        int count = 0;

        for (int i = 0 ; i < num.length ; i++) {
            currentSum += num[i];
            if (map.containsKey ( currentSum - k )) {
                count += map.get ( currentSum - k );
            }
            map.put ( currentSum, map.getOrDefault ( currentSum, 0 ) + 1 );
        }
        return count;
    }
}
