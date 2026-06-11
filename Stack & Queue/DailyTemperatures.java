/*
 * PROBLEM: Daily Temperatures
 * STATEMENT: Ek integer array 'temperatures' diya hai jo har din ka temperature batata hai. Aapko ek array 'answer' return karna hai, jahan answer[i] batata hai ki us i-th din ke baad kitne dino tak WAITING karni padegi jab tak ki usse ZYADA (warmer) temperature wala din na aa jaye. Agar aage koi bhi aisa din nahi hai jo usse zyada garam ho, toh 0 rakhna hai.
 * EXAMPLE: temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
 * Output: [1, 1, 4, 2, 1, 1, 0, 0]
 * (Explanation: 73 ke baad agle hi din 74 hai jo bada hai -> 1 day wait. 75 ke baad direct 4 din baad 76 aata hai -> 4 days wait.)
 * CONSTRAINTS: Length <= 10^5, temperatures[i] <= 100. Time complexity O(n) honi chahiye.
 */

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures ( temperatures );
        System.out.println ( "Waiting days: " + Arrays.toString ( result ) );
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<> ();

        for (int i = 0 ; i < n ; i++) {
            while (!stack.isEmpty () && temperatures[i] > temperatures[stack.peek ()]) {
                int prevIndex = stack.pop ();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push ( i );
        }
        return ans;
    }
}
