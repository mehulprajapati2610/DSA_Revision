/*
 * PROBLEM: Rotate Array
 * STATEMENT: Aapko ek integer array 'nums' diya hai. Aapko is array ko 'k' steps ke liye right side (aage ki taraf) rotate karna hai, jahan 'k' ek non-negative integer hai. Yeh rotation aapko in-place (usi array mein) karni hai.
 * EXAMPLE: nums = [1, 2, 3, 4, 5], k = 1
 * Output: [5, 1, 2, 3, 4]
 * (Explanation: Array ko 1 step right rotate karne par aakhiri element '5' uthakar sabse aage aa jayega, aur baaki saare elements ek-ek position aage shift ho jayenge.)
 */

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        rotate(num,1);
        System.out.println ( Arrays.toString (num));
    }

    public static void rotate(int[] num, int k){
        int n = num.length;
        k = k % n;

        reverse(num,0, n-1);
        reverse(num, 0, k-1);
        reverse(num, k, n-1);
    }

    public static void reverse(int[] num, int start, int end){
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
