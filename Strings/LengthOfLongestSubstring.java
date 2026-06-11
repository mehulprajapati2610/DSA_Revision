/*
 * PROBLEM: Longest Substring Without Repeating Characters
 * STATEMENT: Aapko ek string 's' di gayi hai. Aapko usme se sabse lambi aisi substring (lagatar characters) dhoondni hai jisme koi bhi character repeat (dubara) na ho raha ho, aur uski length return karni hai.
 * EXAMPLE: s = "abcabcccbbbababaabcdfd"
 * Output: 4
 * (Explanation: Is string mein sabse lambi bina repeat hone wali substring "bcdf" hai, jiski length 4 hai.)
 */

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcccbbbababaabcdfd";
        System.out.println ( "Length of Longest Substring : " + lengthOfLongestSubstring ( s ) );
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<> ();

        while (right < s.length ()) {
            char ch = s.charAt ( right );
            if (!set.contains ( ch )) {
                set.add ( ch );
                maxLen = Math.max ( maxLen, right - left + 1 );
                right++;
            } else {
                set.remove ( s.charAt ( left ) );
                left++;
            }
        }
        return maxLen;
    }
}
