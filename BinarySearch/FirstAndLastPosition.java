/*
 * PROBLEM: Find First and Last Position of Element in Sorted Array
 * STATEMENT: Ek sorted integer array 'nums' (jisme duplicates ho sakte hain) aur ek 'target' diya hai. Aapko target ki starting aur ending position (indices) dhoondni hain. Agar target nahi milta, toh [-1, -1] return karo.
 * EXAMPLE: nums = [5, 7, 7, 8, 8, 10], target = 8 -> Output: [3, 4]
 * (Explanation: 8 index 3 par shuru ho rha hai aur index 4 par khatam)
 * CONSTRAINTS: Length <= 10^5, sorted order, O(log n) time complexity.
 */

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println ( "Positions: " + Arrays.toString ( searchRange ( nums, target ) ) );
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        result[0] = findPosition ( nums, target, true );
        result[1] = findPosition ( nums, target, false );

        return result;
    }

    public static int findPosition(int[] nums, int target, boolean isFirst) {
        int low = 0;
        int high = nums.length - 1;
        int potentialPos = -1;

        while (low <= high) {
            int mid = low + ( high - low ) / 2;
            if (nums[mid] == target) {
                potentialPos = mid;

                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return potentialPos;
    }
}
