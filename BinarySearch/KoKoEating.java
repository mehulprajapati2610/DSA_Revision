/*
 * PROBLEM: Koko Eating Bananas
 * STATEMENT: Koko ke samne bananas ke kuch piles (dher) rakhe hain, jahan piles[i] batata hai ki us pile mein kitne kele hain. Guard ke aane mein 'h' ghante (hours) baaki hain. Koko ko ek aisi minimum constant speed 'k' (bananas per hour) chunni hai, taaki wo saare kele 'h' ghante ke andar kha sake.
 * Agar kisi pile mein speed 'k' se kam kele hain, toh Koko use kha kar baaki bacha ghanta aaram karegi (yaani ek ghante mein ek hi pile khayegi).
 * EXAMPLE: piles = [3, 6, 7, 11], h = 8 -> Output: 4
 * (Explanation: Agar speed k = 4 hai:
 * Pile 1 (3 kele): 1 ghanta
 * Pile 2 (6 kele): 2 ghante (4 + 2 bache)
 * Pile 3 (7 kele): 2 ghante (4 + 3 bache)
 * Pile 4 (11 kele): 3 ghante (4 + 4 + 3 bache)
 * Total hours = 1 + 2 + 2 + 3 = 8 hours. Isse kam speed par 8 ghante mein khatam nahi ho pata!)
 * CONSTRAINTS: Piles length <= 10^4, piles[i] <= 10^9, h >= piles.length.
 */

public class KoKoEating {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println ( "Minimum spped required: " + minEatingSpeed ( piles, h ) );
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max ( high, pile );
        }

        int ans = high;

        while (low <= high) {
            int mid = low + ( high - low ) / 2;

            if (canEatAll ( piles, mid, h )) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean canEatAll(int[] piles, int k, int h) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += ( pile + k - 1 ) / k;
        }
        return totalHours <= h;
    }
}
