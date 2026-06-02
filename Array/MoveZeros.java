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

