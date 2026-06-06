public class MaxSumSubarrayK {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 1, 3, 2};
        int k = 3;
        System.out.println ( "Maximum Sum in size of " + k + " element is " + maxSumOfSubarray ( nums, k ) );
    }

    public static int maxSumOfSubarray(int[] nums, int k) {
        int windowSum = 0;
        int maxSum = 0;
        for (int i = 0 ; i < k ; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int i = k ; i < nums.length ; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max ( maxSum, windowSum );
        }
        return maxSum;
    }
}
