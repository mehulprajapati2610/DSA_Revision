/*
 * PROBLEM: Two Sum
 * STATEMENT: Aapko ek integer array 'nums' aur ek integer 'target' diya hai. Aapko is array mein se aise do numbers dhoondne hain jinka sum (jod) 'target' ke barabar ho. Aapko un dono numbers ke indices (positions) ek array ke roop mein return karne hain. Aap maan sakte hain ki har input ka bilkul ek hi solution hoga, aur aap ek hi element ko do baar use nahi kar sakte.
 * EXAMPLE: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * (Explanation: Kyunki nums[0] + nums[1] == 2 + 7 = 9 hai, jo ki hamare target ke barabar hai, isliye unke indices [0, 1] return honge.)
 */

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum ( nums, target );
        System.out.println ( "Indices: " + result[0] + ", " + result[1] );
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        for (int i = 0 ; i < nums.length ; i++) {
            int complement = target - nums[i];
            if (map.containsKey ( complement )) {
                return new int[]{map.get ( complement ), i};
            }
            else {
                map.put ( nums[i], i );
                }
            }
        return new int[]{-1, -1};
    }
}

