import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum ( num );
        System.out.println ( result );
    }

    public static List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ans = new ArrayList<> ();

        Arrays.sort ( num );

        for (int i = 0 ; i < num.length - 2 ; i++) {
            if (i > 0 && num[i] == num[i + 1]) continue;

            int low = i + 1;
            int high = num.length - 1;

            while (low < high) {
                int sum = num[i] + num[low] + num[high];

                if(sum==0){
                    ans.add ( Arrays.asList ( num[i],num[low],num[high] ) );

                    while(low < high && num[low] == num[low+1]) low++;
                    while(low < high && num[high] == num[high-1]) high--;

                    low++;
                    high--;
                }
                else if(sum < 0 ){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return ans;
    }
}
