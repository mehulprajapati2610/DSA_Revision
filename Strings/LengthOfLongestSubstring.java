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
