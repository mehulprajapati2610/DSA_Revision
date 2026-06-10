/*
 * PROBLEM: Search Insert Position
 * STATEMENT: Ek sorted array 'nums' (unique elements) aur ek 'target' value di hai. Agar target mil jata hai, toh uska index return karo. Agar nahi milta, toh wo index return karo jahan use agar insert kiya jaye toh array abhi bhi sorted rahe.
 * EXAMPLE 1: nums = [1, 3, 5, 6], target = 5 -> Output: 2 (5 index 2 par mil gaya)
 * EXAMPLE 2: nums = [1, 3, 5, 6], target = 2 -> Output: 1 (2 array mein nahi hai, par agar insert karein toh index 1 par [1, 2, 3, 5, 6] banega)
 * CONSTRAINTS: Length <= 10^4, O(log n) time mein solve karna hai.
 */

public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println ( insertAt ( nums, target ) );
    }

    public static int insertAt(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + ( high - low ) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
