/*
 * PROBLEM: Valid Palindrome
 * STATEMENT: Aapko ek string 's' di gayi hai. Aapko check karna hai ki kya yeh ek valid palindrome hai. Palindrome ka matlab hai ki string ko aage se padhein ya peeche se, woh bilkul same honi chahiye. Isme aapko saare capital letters ka case ignore karna hai aur spaces ya symbols (punctuation) ko skip kar dena hai.
 * EXAMPLE: s = "A man, a plan, a canal: Panama"
 * Output: true
 * (Explanation: Agar hum saare non-alphanumeric characters ko hata dein aur lowercase mein badlein, toh string "amanaplanacanalpanama" banti hai, jo aage aur peeche dono taraf se padhne mein bilkul barabar hai.)
 */

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println ( "Is palindrome? : " + isPalindrome ( s ) );
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length () - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit ( s.charAt ( start ) )) {
                start++;
            } else if (!Character.isLetterOrDigit ( s.charAt ( end ) )) {
                end--;
            } else {
                if (Character.toLowerCase ( s.charAt ( start ) ) != Character.toLowerCase ( s.charAt ( end ) )) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
