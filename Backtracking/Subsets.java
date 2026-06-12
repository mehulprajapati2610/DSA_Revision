/*
 * PROBLEM: Subsets
 * STATEMENT: Ek unique integers ka array 'nums' diya hai. Uske saare possible subsets (the power set) return karne hain.
 * Output mein duplicate subsets nahi hone chahiye, aur order kuch bhi ho sakta hai.
 * EXAMPLE: nums = [1, 2, 3]
 * Output: [[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]]
 */

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> output = subsets ( nums );

        System.out.println ( "Possible subsets: " + output );
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<> ();
        generateSubsets ( 0, nums, new ArrayList<> (), result );
        return result;
    }

    private static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add ( new ArrayList<> ( current ) );
            return;
        }

        current.add ( nums[index] );
        generateSubsets ( index + 1, nums, current, result );

        current.remove ( current.size () - 1 );

        generateSubsets ( index + 1, nums, current, result );
    }
}

