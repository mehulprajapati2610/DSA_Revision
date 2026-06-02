public class BuyAndSellStock{
    public static void main(String[] args) {
        int[] prices = {7,6,5,4,3,2,1};
        int profit = maxProfit(prices);
        System.out.println ("Maximum Profit is : "+profit);
    }

    public static int maxProfit(int[] arr){
        int minPrice=Integer.MAX_VALUE;
        int maximum=0;

        for(int i=0;i< arr.length;i++){
            if(minPrice > arr[i]){
                minPrice=arr[i];
            }
            else if(maximum < arr[i] - minPrice){
                maximum = arr[i] - minPrice;
            }
        }
        return maximum;
    }
}
