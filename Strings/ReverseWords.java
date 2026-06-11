/*
 * PROBLEM: Reverse Words in a String
 * STATEMENT: Aapko ek string 's' di gayi hai jisme kai words hain jo spaces se separated hain. Aapko is string ke words ka order bilkul ulta (reverse) karna hai. Dhyan rahe ki shuruat aur aakhiri ki faltu spaces hat jani chahiye, aur do words ke beech mein sirf ek single space honi chahiye.
 * EXAMPLE: s = "  the sky is   blue  "
 * Output: "blue is sky the"
 * (Explanation: Shuruat aur end ki spaces ko trim kiya gaya, beech ki multiple spaces ko single space mein badla gaya, aur saare words ko peeche se aage ke order mein arrange kar diya gaya.)
 */

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  the sky is   blue  ";
        System.out.println ( "Original: '" + s + "'" );
        System.out.println ( "Reversed: '" + reverseWords ( s ) + "'" );
    }

    public static String reverseWords(String s) {
        s = s.trim ();

        String[] words = s.split ( "\\s+" );
        StringBuilder result = new StringBuilder ();

        for (int i = words.length - 1 ; i >= 0 ; i--) {
            result.append ( words[i] );
            if (i > 0) {
                result.append ( " " );
            }
        }
        return result.toString ();
    }
}
