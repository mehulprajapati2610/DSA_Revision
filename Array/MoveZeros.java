/*
 * PROBLEM: Move Zeroes
 * STATEMENT: Aapko ek integer array 'nums' diya hai. Aapko is array ke saare 0s ko uthakar array ke aakhiri (end) mein move karna hai, jabki non-zero elements ka relative order (jis sequence mein woh pehle the) bilkul same rehna chahiye. Yeh saara kaam aapko in-place karna hai, yaani kisi naye array ka use nahi karna hai.
 * EXAMPLE: nums = [0, 1, 0, 4]
 * Output: [1, 4, 0, 0]
 * (Explanation: Non-zero elements '1' aur '4' ka order same raha, aur dono 0s shift hokar array ke aakhiri mein chale gaye.)
 */

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] num = {0,1,0,4};
        moveZeroes(num);
        System.out.println( Arrays.toString(num));
    }

    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;

                lastNonZeroFoundAt++;
            }
        }
    }
}

