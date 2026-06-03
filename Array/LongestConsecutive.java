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
