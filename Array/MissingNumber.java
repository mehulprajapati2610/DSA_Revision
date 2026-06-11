/*
 * PROBLEM: Missing Number
 * STATEMENT: Aapko 'n' distinct (alag-alag) numbers ka ek array 'nums' diya hai, jahan saare numbers $0$ se lekar 'n' ki range ($[0, n]$) mein hain. Is range ke saare numbers mein se ek number array mein missing (gayab) hai. Aapko us missing number ko dhoond kar return karna hai.
 * EXAMPLE: nums = [0, 1, 3, 4]
 * Output: 2
 * (Explanation: Array ka size (n) 4 hai, toh range [0, 4] honi chahiye (0, 1, 2, 3, 4). Is range mein se number 2 missing hai, isliye output 2 hoga.)
 */

public class MissingNumber {
    public static void main(String[] args) {
        int[] num = {0,1,3,4};
        System.out.println ("the missing valur is "+missingValue(num));
    }

    public static int missingValue(int[] arr){
        int n = arr.length;
        int expectedSum = n * (n+1)/2;
        int actualSum = 0;

        for(int num : arr){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
