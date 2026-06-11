/*
 * PROBLEM: Longest Consecutive Sequence
 * STATEMENT: Aapko ek unsorted integer array 'nums' diya hai. Aapko is array mein se sabse lambi lagatar sequence (consecutive elements sequence) ki length dhoondni hai. Sequence ke elements ka array mein kisi bhi order mein hona chalta hai, bas unka lagatar (jaise 1, 2, 3, 4...) hona zaroori hai.
 * EXAMPLE: nums = [1, 100, 2, 3, 200, 4, 5, 65]
 * Output: 5
 * (Explanation: Sabse lambi lagatar sequence [1, 2, 3, 4, 5] hai. Is sequence ki total length 5 hai, isliye output 5 hoga.)
 */

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] num = {1,100,2,3,200,4,5,65};
        int answer = longestConsecutive(num);
        System.out.println (answer);
    }

    public static int longestConsecutive(int[] num){
        Set<Integer> set = new HashSet<> ();
        for(int val : num){
            set.add ( val );
        }

        int longestStreak = 0;
        for(int n : set){
            if(!set.contains ( n-1 )){
                int currentNum = n;
                int currentStreak = 1;

                while(set.contains ( currentNum+1 )){
                    currentNum+=1;
                    currentStreak+=1;
                }

                longestStreak = Math.max ( longestStreak, currentStreak );
            }
        }
        return longestStreak;
    }
}
