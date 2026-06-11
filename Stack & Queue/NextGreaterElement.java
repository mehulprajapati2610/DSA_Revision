/*
 * PROBLEM: Next Greater Element I
 * STATEMENT: Aapko do arrays diye hain: 'nums1' aur 'nums2', jahan 'nums1', 'nums2' ka ek subset hai (yaani nums1 ke saare elements nums2 mein exist karte hain). Aapko nums1 ke har element ke liye nums2 mein uska NEXT GREATER ELEMENT dhoondna hai.
 * Next Greater Element ka matlab hai nums2 mein us element ke RIGHT side mein aane wala sabse pehla bada element. Agar koi bada element nahi milta, toh -1 rakho.
 * EXAMPLE: nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2]
 * Output: [-1, 3, -1]
 * (Explanation:
 * - nums2 mein 4 ke right mein koi bada element nahi hai -> -1
 * - nums2 mein 1 ke right mein pehla bada element 3 hai -> 3
 * - nums2 mein 2 ke right mein koi bada element nahi hai -> -1)
 * CONSTRAINTS: Dono arrays ke saare elements unique hain. Time complexity O(nums1.length + nums2.length) honi chahiye.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        int[] result = nextGreater ( num1, num2 );
        System.out.println ( "Next Greater Elements: " + Arrays.toString ( result ) );
    }

    public static int[] nextGreater(int[] nums1, int[] num2) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        Stack<Integer> stack = new Stack<> ();

        for (int num : num2) {
            while (!stack.isEmpty () && num > stack.peek ()) {
                map.put ( stack.pop (), num );
            }
            stack.push ( num );
        }

        int[] ans = new int[nums1.length];
        for (int i = 0 ; i < nums1.length ; i++) {
            ans[i] = map.getOrDefault ( nums1[i], -1 );
        }
        return ans;
    }
}
