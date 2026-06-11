/*
 * PROBLEM: Best Time to Buy and Sell Stock
 * STATEMENT: Aapko ek array 'prices' diya hai jahan 'prices[i]' kisi stock ki ith day par price batata hai. Aapko ek single transaction (ek baar kharidna aur ek baar bechna) karke maximum profit earn karna hai. Note karein ki aap stock ko bechne se pehle hi kharid sakte hain (you must buy before you sell). Agar koi profit earn nahi kiya ja sakta, toh 0 return karein.
 * EXAMPLE: prices = [7, 6, 5, 4, 3, 2, 1]
 * Output: 0
 * (Explanation: Is case mein prices lagatar kam ho rahi hain, isliye koi bhi profit nahi banaya ja sakta. Maximum profit 0 hoga.)
 */

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
