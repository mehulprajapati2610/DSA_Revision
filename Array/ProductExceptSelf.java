/*
 * PROBLEM: Product of Array Except Self
 * STATEMENT: Aapko ek integer array 'nums' diya hai. Aapko ek naya array 'result' return karna hai jahan 'result[i]' ka matlab ho array ke saare elements ka product (guna), sivay 'nums[i]' ke. Aapko yeh problem bina division operator (/) ka use kiye aur $O(n)$ time complexity mein solve karni hai.
 * EXAMPLE: nums = [2, 5, 4, 1]
 * Output: [20, 8, 10, 40]
 * (Explanation:
 * result[0] = 5 * 4 * 1 = 20
 * result[1] = 2 * 4 * 1 = 8
 * result[2] = 2 * 5 * 1 = 10
 * result[3] = 2 * 5 * 4 = 40)
 */

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] num = {2,5,4,1};
        int[] answerproduct = productExceptItSelf(num);
        System.out.println( Arrays.toString(answerproduct));
    }

    public static int[] productExceptItSelf(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        result[0]=1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1] * arr[i-1];
        }

        int rightProduct=1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * arr[i];
        }
        return result;
    }

}
