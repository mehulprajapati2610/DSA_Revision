/*
 * PROBLEM: Find Peak Element
 * STATEMENT: Ek integer array 'nums' diya hai. Aapko ek 'peak' element dhoondna hai aur uska index return karna hai. Peak element wo hota hai jo apne padosi (left aur right neighbors) se strictly bada ho.
 * Array ke dono ends par hum minus infinity (-∞) maante hain (yaani nums[-1] = -∞ aur nums[n] = -∞).
 * EXAMPLE: nums = [1, 2, 1, 3, 5, 6, 4] -> Output: 5 (Kyunki index 5 par element 6 hai, jo 5 aur 4 dono se bada hai. Index 1 par 2 bhi ek valid peak hai, koi bhi ek return kar sakte hain).
 * CONSTRAINTS: Length <= 1000, nums[i] != nums[i+1] (padosi same nahi honge). Time complexity O(log n) honi chahiye.
 */

public class FindPeak {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 8, 5, 6, 4};
        System.out.println ( "Peak element is at index: " + findPeak ( nums ) );
    }

    public static int findPeak(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + ( high - low ) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
