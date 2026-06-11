/*
 * PROBLEM: Trapping Rain Water
 * STATEMENT: Aapko 'n' non-negative integers ka ek array 'height' diya hai jahan har ek element ek bar (diwar) ki width 1 aur uski height darshata hai. Ek barsaat ke mausam mein, in bars ke beech mein kitna paani trap (ikattha) ho sakta hai, aapko us total paani ki quantity (volume) calculate karke return karni hai.
 * EXAMPLE: height = [0, 1, 0, 8, 1, 0, 7, 3, 2, 1, 2, 1]
 * Output: 9
 * (Explanation: Bars ki heights ke beech mein jo khaali jagah (depressions) banti hain, wahan paani ruk jata hai. Jaise index 2 par (left_max=1 aur right_max=8) ke beech mein 1 unit paani rukega. Is tarah poore array mein calculation karne par total trapped water 9 units hoga.)
 */

public class TrappinngRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 8, 1, 0, 7, 3, 2, 1, 2, 1};
        System.out.println ( "trapped water : " + trappedWater ( height ) );
    }

    public static int trappedWater(int[] height) {
        int n = height.length;
        if (n <= 2) return 0;
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }

        }
        return totalWater;
    }
}
