/*
 * PROBLEM: Valid Anagram
 * STATEMENT: Aapko do strings 's' aur 't' di gayi hain. Aapko check karna hai ki kya 't', string 's' ka ek valid anagram hai ya nahi. Ek anagram tab banta hai jab hum kisi string ke characters ko aage-piche rearrange karke ek naya word banatein hain, jisme saare characters bilkul barabar ginti (frequency) mein hote hain.
 * EXAMPLE: s = "validanagram", t = "vlidaagnaarm"
 * Output: true
 * (Explanation: Dono strings ki length same hai aur dono mein har ek character (jaise 'a', 'g', 'm', etc.) bilkul barabar baar aaya hai, bas unka order alag hai.)
 */

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
