import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println ( "Minimum Window: " + minWindow ( s, t ) );
    }

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length () < t.length ()) return "";

        Map<Character, Integer> mapT = new HashMap<> ();
        for (char c : t.toCharArray ()) {
            mapT.put ( c, mapT.getOrDefault ( c, 0 ) + 1 );
        }

        Map<Character, Integer> windowMap = new HashMap<> ();

        int have = 0;
        int need = mapT.size ();

        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        int left = 0;

        for (int right = 0 ; right < s.length () ; right++) {
            char c = s.charAt ( right );
            windowMap.put ( c, windowMap.getOrDefault ( c, 0 ) + 1 );

            if (mapT.containsKey ( c ) && windowMap.get ( c ).intValue () == mapT.get ( c ).intValue ()) {
                have++;
            }

            while (have == need) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt ( left );
                windowMap.put ( leftChar, windowMap.get ( leftChar ) - 1 );

                if (mapT.containsKey ( leftChar ) && windowMap.get ( leftChar ) < mapT.get ( leftChar )) {
                    have--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring ( minStart, minStart + minLen );
    }
}
