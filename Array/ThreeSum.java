/*
 * PROBLEM: 3Sum
 * STATEMENT: Aapko ek integer array 'nums' diya hai. Aapko array mein se aise saare unique triplets (teen numbers ka group) dhoondne hain `[nums[i], nums[j], nums[k]]` jahan teeno alag-alag index par hon (`i != j`, `i != k`, aur `j != k`) aur unka sum zero (`nums[i] + nums[j] + nums[k] == 0`) ho. Dhyan rahe ki aapke output mein koi bhi duplicate triplet nahi hona chahiye.
 * EXAMPLE: nums = [-1, 0, 1, 2, -1, -4]
 * Output: [[-1, -1, 2], [-1, 0, 1]]
 * (Explanation: Array ko sort karne par yeh `[-4, -1, -1, 0, 1, 2]` ban jata hai. Yahan do unique triplets milte hain jinka sum 0 hai: `-1 + (-1) + 2 = 0` aur `-1 + 0 + 1 = 0`.)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum ( num );
        System.out.println ( result );
    }

    public static List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ans = new ArrayList<> ();

        Arrays.sort ( num );

        for (int i = 0 ; i < num.length - 2 ; i++) {
            if (i > 0 && num[i] == num[i + 1]) continue;

            int low = i + 1;
            int high = num.length - 1;

            while (low < high) {
                int sum = num[i] + num[low] + num[high];

                if(sum==0){
                    ans.add ( Arrays.asList ( num[i],num[low],num[high] ) );

                    while(low < high && num[low] == num[low+1]) low++;
                    while(low < high && num[high] == num[high-1]) high--;

                    low++;
                    high--;
                }
                else if(sum < 0 ){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return ans;
    }
}
