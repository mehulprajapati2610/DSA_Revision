/*
 * PROBLEM: Combination Sum
 * STATEMENT: Ek unique integers ka array 'candidates' aur ek 'target' integer diya hai.
 * Aapko un saare unique combinations ki list return karni hai jahan chose kiye gaye numbers ka sum exact 'target' ke barabar ho.
 * Aap ek hi number ko UNLIMITED number of times use kar sakte hain.
 * EXAMPLE: candidates = [2, 3, 6, 7], target = 7
 * Output: [[2, 2, 3], [7]]
 */

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> output = combination ( nums, target );

        System.out.println ( "Possible combinations: " + output );
    }

    public static List<List<Integer>> combination(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<> ();
        findCombinations ( 0, nums, target, new ArrayList<> (), result );
        return result;
    }

    private static void findCombinations(int index, int[] nums, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add ( new ArrayList<> (current) );
            return;
        }

        if(target < 0 || index == nums.length) return;

        if (nums[index] <= target) {
            current.add ( nums[index] );
            findCombinations ( index, nums, target - nums[index], current, result );
            current.remove ( current.size () - 1 );
        }

        findCombinations ( index + 1, nums, target, current, result );
    }
}
