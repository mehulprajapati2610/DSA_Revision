import java.util.Arrays;

/*
 * PROBLEM: Sort Colors (Dutch National Flag)
 * STATEMENT: Ek array 'nums' diya hai jisme 'n' elements hain aur har element ka rang 0 (Red), 1 (White), ya 2 (Blue) hai. Aapko is array ko in-place is tarah sort karna hai taaki saare 0s pehle aayin, fir saare 1s, aur aakhir mein saare 2s aayein.
 * EXAMPLE: nums = [2, 0, 2, 1, 1, 0] -> Output: [0, 0, 1, 1, 2, 2]
 * CONSTRAINTS: Length <= 300, elements sirf 0, 1, ya 2 honge.
 */
public class SortColors {
    public static void main(String[] args) {
        int[] num = {2, 0, 2, 1, 1, 0};
        sortColor ( num );
        System.out.println ( "Sorted Array: " + Arrays.toString ( num ) );
    }

    public static void sortColor(int[] num) {
        int low = 0;
        int mid = 0;
        int high = num.length - 1;

        while (mid <= high) {
            if (num[mid] == 0) {
                swap ( num, low, mid );
                low++;
                mid++;
            } else if (num[mid] == 1) {
                mid++;
            } else {
                swap ( num, mid, high );
                high--;
            }
        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
