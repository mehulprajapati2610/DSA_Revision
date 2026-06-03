import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{4,5}};

        int[][] result = merge(intervals);
        System.out.println ("Merged Intervals : "+ Arrays.deepToString (result));
    }

    public static int[][] merge(int[][] intervals){
        if(intervals.length <= 1) return intervals;

        Arrays.sort ( intervals, (a, b) -> Integer.compare ( a[0], b[0] ) );

        List<int[]> merged = new ArrayList<> ();
        int[] currentInterval = intervals[0];
        merged.add ( currentInterval );

        for(int[] nextInterval : intervals){
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];

            if(currentEnd >= nextStart){
                currentInterval[1] = Math.max ( currentEnd, nextEnd );
            }else{
                currentInterval = nextInterval;
                merged.add ( currentInterval );
            }
        }
        return merged.toArray (new int[merged.size ()][]);
    }
}
