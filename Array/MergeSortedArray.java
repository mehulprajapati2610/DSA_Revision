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
