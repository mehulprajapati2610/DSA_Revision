/*
 * PROBLEM: Two Sum II - Input Array Is Sorted
 * STATEMENT: Ek 1-indexed integer array diya hai jo pehle se ascending (sorted) order mein hai. Aapko do aise numbers dhoondne hain jinka sum ek given 'target' ke barabar ho, aur unke indices (1-based) return karne hain.
 * EXAMPLE: numbers = [2, 7, 11, 15], target = 9 -> Output: [1, 2] (2 + 7 = 9, aur inke 1-based indices 1 aur 2 hain)
 * CONSTRAINTS: Length <= 3 * 10^4, sorted order, exactly ek unique solution exist karta hai.
 */

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 18;
        System.out.println ( "the answer: " + Arrays.toString ( findindex ( arr,target ) ) );
    }

    public static int[] findindex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
