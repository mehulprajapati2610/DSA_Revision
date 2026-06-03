import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] num = {2,5,4,1};
        int[] answerproduct = productExceptItSelf(num);
        System.out.println( Arrays.toString(answerproduct));
    }

    public static int[] productExceptItSelf(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        result[0]=1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1] * arr[i-1];
        }

        int rightProduct=1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * arr[i];
        }
        return result;
    }

}
