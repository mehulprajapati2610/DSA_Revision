/*
 * PROBLEM: Container With Most Water
 * STATEMENT: Aapko ek integer array 'height' diya hai jahan har ek element vertical lines ki height darshata hai. Aapko do lines aisi chunni hain jo x-axis ke saath milkar ek aisa container banayein jisme sabse zyada paani (maximum water) aa sake. Aapko us container ka maximum area (volume) return karna hai. Note karein ki aap container ko slant (tedha) nahi kar sakte.
 * EXAMPLE: height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
 * Output: 49
 * (Explanation: Index 1 par height 8 hai aur index 8 par height 7 hai. Dono ke beech ka distance (8 - 1) = 7 hai. Paani ki height min(8, 7) = 7 hogi. Total area = 7 * 7 = 49 hoga, jo ki maximum hai.)
 */

public class ContainerWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int answer = mostWater(height);
        System.out.println (answer);
    }

    public static int mostWater(int[] num){
        int n = num.length;
        int start = 0;
        int end = n-1;

        int maxWater = 0;
        while(start < end){
            int currentWater = Math.min ( num[start],num[end] ) * (end - start);
            if(currentWater > maxWater){
                maxWater = currentWater;
            }
            if(num[start] < num[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxWater;
    }
}
