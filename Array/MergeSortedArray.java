/*
 * PROBLEM: Merge Sorted Array
 * STATEMENT: Aapko do sorted integer arrays 'nums1' aur 'nums2' diye hain, jo non-decreasing order mein sorted hain. Saath hi 'm' aur 'n' diya hai jo dono arrays ke actual elements ke count ko darshate hain. Aapko dono arrays ko merge karke ek hi sorted array banana hai, aur result ko alag se return karne ke bajay 'nums1' array ke andar hi in-place store karna hai. Isliye 'nums1' ka total size (m + n) hota hai, jahan aakhiri 'n' elements ko 0 se initialize kiya jata hai taaki 'nums2' ke elements fit ho sakein.
 * EXAMPLE: nums1 = [1, 2, 24, 30, 0, 0, 0], nums2 = [17, 27, 37]
 * Output: [1, 2, 17, 24, 27, 30, 37]
 * (Explanation: Jab hum [1, 2, 24, 30] aur [17, 27, 37] ko merge karte hain, toh final sorted array [1, 2, 17, 24, 27, 30, 37] banta hai jo 'nums1' ke andar hi update ho jata hai.)
 */

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 24, 30, 0, 0, 0};
        int[] nums2 = {17, 27, 37};
        mergeSortArray ( nums1, nums2 );
        System.out.println ( Arrays.toString ( nums1 ) );
    }

    public static void mergeSortArray(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int m = nums1.length - n;
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }

        while (p2 >= 0) {
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
    }
}
