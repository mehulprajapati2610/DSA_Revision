/*
 * PROBLEM: Binary Search
 * STATEMENT: Ek sorted integer array 'nums' (ascending order mein) aur ek 'target' value di hai. Agar target array mein exist karta hai, toh uska index return karo, nahi toh -1 return karo. Aapko algorithm O(log n) runtime complexity mein likhna hai.
 * EXAMPLE: nums = [-1, 0, 3, 5, 9, 12], target = 9 -> Output: 4 (Kyunki 9 index 4 par hai)
 * CONSTRAINTS: Length <= 10^4, Elements unique hain aur sorted hain.
 */

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 5;
        System.out.println ( "the element " + target + " is at index " + search ( nums, target ) );
    }

    public static int search(int[] nums, int target) {
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
        return -1;
    }
}
