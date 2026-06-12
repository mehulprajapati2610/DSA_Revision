/*
 * PROBLEM: Permutations
 * STATEMENT: Ek unique integers ka array 'nums' diya hai. Uske saare possible arrangements (permutations) return karne hain.
 * Output ka order kuch bhi ho sakta hai.
 * EXAMPLE: nums = [1, 2, 3]
 * Output: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]
 */

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> output = permutation ( nums );

        System.out.println ( "Total Permutations: " + output );
    }

    public static List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> result = new ArrayList<> ();
        backtrack ( 0, nums, result );
        return result;
    }

    private static void backtrack(int index, int[] nums, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> current = new ArrayList<> ();
            for (int num : nums) {
                current.add ( num );
            }
            result.add ( current );
            return;
        }

        for (int i = index ; i < nums.length ; i++) {
            swap ( nums, index, i );
            backtrack ( index + 1, nums, result );
            swap ( nums, index, i );
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
