/*
 * PROBLEM: Maximum Average Subarray I
 * STATEMENT: Ek integer array 'nums' aur ek number 'k' diya hai. Aapko 'k' length ka ek aisa contiguous subarray dhoondna hai jiska average sum sabse ZYADA ho, aur wo maximum average value (double mein) return karni hai.
 * EXAMPLE: nums = [1, 12, -5, -6, 50, 3], k = 4 -> Output: 12.75
 * (Explanation: Subarray [12, -5, -6, 50] ka sum 51 hai, aur average 51/4 = 12.75 hai jo sabse bada hai)
 * CONSTRAINTS: Length <= 10^5, -10^4 <= nums[i] <= 10^4, k <= Length
 */

public class MaxAvgSubarray {
    public static void main(String[] args) {
        int[] nums = {4, -2, 0, 8, -1, 5};
        int k = 3;
        System.out.println ( "Maximum Average: " + maxAvg ( nums, k ) );
    }

    public static double maxAvg(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0 ; i < k ; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k ; i < nums.length ; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];

            maxSum = Math.max ( maxSum, windowSum );
        }
        return ( double ) maxSum / k;
    }
}
