/*
 * PROBLEM: Search in Rotated Sorted Array
 * STATEMENT: Ek sorted array diya hai jise kisi pivot index par rotate kar diya gaya hai (e.g., [0,1,2,4,5,6,7] ban sakta hai [4,5,6,7,0,1,2]). Aapko is rotated array mein ek 'target' element ko dhoondna hai. Agar mil jaye toh uska index return karo, nahi toh -1.
 * EXAMPLE: nums = [4, 5, 6, 7, 0, 1, 2], target = 0 -> Output: 4 (Kyunki 0 index 4 par hai)
 * CONSTRAINTS: Saare elements unique hain. Time complexity O(log n) honi chahiye.
 */

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println ( searchInRotated ( nums, target ) );
    }

    public static int searchInRotated(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + ( high - low ) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
