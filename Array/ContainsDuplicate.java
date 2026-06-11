/*
 * PROBLEM: Contains Duplicate
 * STATEMENT: Aapko ek integer array 'nums' diya hai. Aapko check karna hai ki kya array mein koi bhi value kam se kam do baar (duplicate) aa rahi hai ya nahi. Agar koi bhi value array mein repeat hoti hai toh 'true' return karein, aur agar saare elements unique hain toh 'false' return karein.
 * EXAMPLE: nums = [1, 2, 3, 5, 5]
 * Output: true
 * (Explanation: Is array mein element '5' do baar aa raha hai, yaani duplicate exist karta hai, isliye output true hoga.)
 */

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
