public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {1,2,2,2,3};
        System.out.println ("Majority element is "+majority(array));
    }

    public static int majority(int[] arr){
        int count = 0;
        Integer candidate = null;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
