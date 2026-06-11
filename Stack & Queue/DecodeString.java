/*
 * PROBLEM: Decode String
 * STATEMENT: Ek encoded string 's' di hai, aapko uska decoded string return karna hai. Encoding ka rule yeh hai: k[encoded_string], jahan square brackets ke andar wali string ko exact 'k' baar repeat karna hai. 'k' ek positive integer ho sakta hai.
 * EXAMPLE 1: s = "3[a]2[bc]" -> Output: "aaabcbc"
 * EXAMPLE 2: s = "3[a2[c]]" -> Output: "accaccacc"
 * (Explanation: Pehle andar wala solve hoga: 2[c] -> "cc". Fir bahar wala: 3[a+cc] -> 3[acc] -> "accaccacc")
 * CONSTRAINTS: String valid hai, brackets hamesha balanced honge, aur digits sirf repetition count batane ke liye hain.
 */

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        System.out.println ( "3[a]2[bc] --> " + decodeString ( s1 ) );

        String s2 = "3[a2[c]]";
        System.out.println ( "3[a]2[bc] --> " + decodeString ( s2 ) );
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<> ();
        Stack<StringBuilder> stringStack = new Stack<> ();
        StringBuilder currString = new StringBuilder ();
        int k = 0;

        for (char ch : s.toCharArray ()) {
            if (Character.isDigit ( ch )) {
                k = k * 10 + ( ch - '0' );
            } else if (ch == '[') {
                countStack.push ( k );
                stringStack.push ( currString );

                currString = new StringBuilder ();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = stringStack.pop ();
                int repeatTimes = countStack.pop ();

                for (int i = 0 ; i < repeatTimes ; i++) {
                    decodedString.append ( currString );
                }
                currString = decodedString;
            } else {
                currString.append ( ch );
            }
        }
        return currString.toString ();
    }
}
