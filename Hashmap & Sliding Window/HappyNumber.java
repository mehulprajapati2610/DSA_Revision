/*
 * PROBLEM: Happy Number
 * STATEMENT: Aapko ek integer 'n' diya hai. Aapko check karna hai ki kya yeh ek 'Happy Number' hai ya nahi.
 * Ek Happy Number woh hota hai jisme uske digits ke squares ka sum nikalte hue agar hum is process ko repeat karein, toh aakhiri mein sum 1 aa jata hai. Agar yeh process ek endless loop (cycle) mein phans jaye aur kabhi 1 na aaye, toh woh Happy Number nahi hota. Agar number 1 par pahonch jaye toh 'true' return karein, nahi toh 'false'.
 * EXAMPLE: n = 19
 * Output: true
 * (Explanation:
 * $1^2 + 9^2 = 1 + 81 = 82$
 * $8^2 + 2^2 = 64 + 4 = 68$
 * $6^2 + 8^2 = 36 + 64 = 100$
 * $1^2 + 0^2 + 0^2 = 1 + 0 + 0 = 1$.
 * Kyunki end mein 1 aa gaya, isliye 19 ek Happy Number hai.)
 */

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println ( n + " is HappyNumber? " + isHappy ( n ) );
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext ( n );

        while (fast != 1 && slow != fast) {
            slow = getNext ( slow );
            fast = getNext ( getNext ( fast ) );
        }

        return fast == 1;
    }

    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            totalSum += d * d;
            n = n / 10;
        }
        return totalSum;
    }
}
