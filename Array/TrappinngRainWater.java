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
