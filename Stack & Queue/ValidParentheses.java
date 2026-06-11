/*
 * PROBLEM: Valid Parentheses
 * STATEMENT: Ek string 's' di hai jisme sirf brackets hain: '(', ')', '{', '}', '[' aur ']'. Aapko batana hai ki input string valid hai ya nahi.
 * String tabhi valid hogi jab:
 * 1. Open brackets hamesha same type ke close brackets se band hon.
 * 2. Brackets sahi order mein band hon (jo sabse aakhri mein khula, wo sabse pehle band hoga).
 * EXAMPLE: s = "()[]{}" -> Output: true, s = "([)]" -> Output: false
 * CONSTRAINTS: Length <= 10^4, string mein sirf brackets hain.
 */

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "{}[]()";
        System.out.println ( "{}[]() --> " + isValid ( s1 ) );

        String s2 = "{]()";
        System.out.println ( "{]() --> " + isValid ( s2 ) );
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<> ();

        for (char ch : s.toCharArray ()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push ( ch );
            } else {
                if (stack.isEmpty ()) {
                    return false;
                }

                char top = stack.peek ();

                if (ch == ')' && top == '(' || ch == ']' && top == '[' || ch == '}' && top == '{') {
                    stack.pop ();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty ();
    }
}
