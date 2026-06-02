import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] num = {1,2,3,5,5};
        System.out.println ("the num contains duplicate is "+checkDuplicate(num));
    }

    public static boolean checkDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<> ();
        for(int i=0;i< arr.length;i++){
            if (set.contains (arr[i])){
                return true;
            }
            else{
                set.add ( arr[i] );
            }
        }
        return false;
    }
}
