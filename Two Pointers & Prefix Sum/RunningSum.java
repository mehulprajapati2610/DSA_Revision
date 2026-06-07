/*
 * PROBLEM: Running Sum of 1D Array
 * STATEMENT: Ek integer array 'nums' diya hai. Aapko us array ka running sum nikalna hai, jahan runningSum[i] ka matlab hai nums[0] se lekar nums[i] tak ke saare elements ka total sum.
 * EXAMPLE: nums = [1, 2, 3, 4] -> Output: [1, 3, 6, 10]
 * (Explanation: [1, 1+2, 1+2+3, 1+2+3+4] -> [1, 3, 6, 10])
 * CONSTRAINTS: Length <= 1000, Element Value <= 10^6
 */

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum ( nums );
        System.out.println ( "Running Sum Array: " + Arrays.toString ( result ) );
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1 ; i < nums.length ; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
