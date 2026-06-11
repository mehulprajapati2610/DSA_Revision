/*
 * PROBLEM: Roman to Integer
 * STATEMENT: Aapko ek Roman numeral string 's' di gayi hai, aapko use ek normal integer (number) mein badalna hai. Agar koi chota symbol bade symbol se pehle aata hai, toh uski value subtract (ghatayi) jaati hai (jaise IV = 4), nahi toh saari values add hoti hain.
 * EXAMPLE: s = "MCMXCVI"
 * Output: 1996
 * (Explanation: M (1000) + CM (1000-100=900) + XC (100-10=90) + V (5) + I (1) = 1996. Lekin aapke code ke logic mein ek chota sa bug hai jisse aakhiri character skip ho raha hai, use fix zaroor kar lijiyega!)
 */

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCVI";
        System.out.println ( "Integer Value: " + romanToInt ( s ) );
    }

    public static int romanToInt(String s) {
        int total = 0;

        for (int i = 0 ; i < s.length () - 1 ; i++) {
            int currentValue = getValue ( s.charAt ( i ) );

            if (i + 1 < s.length () && currentValue < getValue ( s.charAt ( i + 1 ) )) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }
        return total;
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }
}
