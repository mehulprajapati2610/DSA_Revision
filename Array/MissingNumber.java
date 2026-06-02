public class MissingNumber {
    public static void main(String[] args) {
        int[] num = {0,1,3,4};
        System.out.println ("the missing valur is "+missingValue(num));
    }

    public static int missingValue(int[] arr){
        int n = arr.length;
        int expectedSum = n * (n+1)/2;
        int actualSum = 0;

        for(int num : arr){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
