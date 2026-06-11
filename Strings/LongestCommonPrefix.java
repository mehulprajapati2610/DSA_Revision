/*
 * PROBLEM: Longest Common Prefix
 * STATEMENT: Aapko strings ka ek array diya hai. Aapko un sabhi strings mein se sabse bada common shuruati hissa (prefix) dhoondna hai jo saari strings mein bilkul same ho. Agar koi common prefix nahi milta, toh khaali string "" return karein.
 * EXAMPLE: str = ["flower", "flow", "flowing"]
 * Output: "flow"
 * (Explanation: Array ko sort karne par pehli string "flow" aur aakhiri "flowing" banti hai. Dono ka shuruati hissa "flow" aapas mein poora match karta hai, isliye yahi sabse bada common prefix hai.)
 */

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flowing"};
        System.out.println ( "Longest Common Prefix: " + longestCommonPrefix ( str ) );
    }

    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) return "";

        Arrays.sort ( str );

        String first = str[0];
        String last = str[str.length - 1];

        int i = 0;

        while (i < first.length () && i < last.length ()) {
            if (first.charAt ( i ) == last.charAt ( i )) {
                i++;
            } else {
                break;
            }
        }
        return first.substring ( 0, i );

    }
}
