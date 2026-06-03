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
