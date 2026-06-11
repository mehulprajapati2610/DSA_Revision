/*
 * PROBLEM: Majority Element
 * STATEMENT: Aapko 'n' size ka ek integer array 'nums' diya hai. Aapko usme se 'majority element' dhoondna hai. Majority element woh element hota hai jo array mein $n / 2$ se zyada baar aata hai. Aap yeh maan sakte hain ki array mein majority element hamesha exist karta hai.
 * EXAMPLE: nums = [1, 2, 2, 2, 3]
 * Output: 2
 * (Explanation: Array ka size 5 hai, aur element '2' yahan 3 baar aaya hai, jo ki $5 / 2$ (2.5) se zyada hai. Isliye 2 majority element hai.)
 */

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {1,2,2,2,3};
        System.out.println ("Majority element is "+majority(array));
    }

    public static int majority(int[] arr){
        int count = 0;
        Integer candidate = null;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
