/*
 * PROBLEM: Remove Duplicates from Sorted Array
 * STATEMENT: Ek sorted integer array 'nums' diya hai. Aapko usmein se duplicate elements ko in-place hatana hai taaki har unique element sirf ek baar aaye. Unique elements ka count 'k' return karo aur array ke pehle 'k' elements mein hi wo unique numbers hone chahiye.
 * EXAMPLE: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] -> Output: k = 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
 * CONSTRAINTS: Length <= 3 * 10^4, sorted order
 */

public class RmDuplicates {
    public static void main(String[] args) {
        int[] num = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        int k = uniqueElements ( num );
        System.out.println ( "total unique elements: " + k );
        System.out.println ( "Modified Array is: " );
        for (int i = 0 ; i < k ; i++) {
            System.out.print ( num[i] + " " );
        }
    }

    public static int uniqueElements(int[] num) {
        if (num.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1 ; j < num.length ; j++) {
            if (num[i] != num[j]) {
                num[++i] = num[j];
            }
        }
        return i + 1;
    }

}
