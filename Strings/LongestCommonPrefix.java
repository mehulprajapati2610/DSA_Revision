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
