public class ValidAnagram {
    public static void main(String[] args) {
        String s = "validanagram";
        String t = "vlidaagnaarm";

        System.out.println ( "anagrams? : " + isAnagram ( s, t ) );
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length () != t.length ()) return false;

        int[] charCount = new int[26];

        for (int i = 0 ; i < s.length () ; i++) {
            charCount[s.charAt ( i ) - 'a']++;
            charCount[t.charAt ( i ) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
