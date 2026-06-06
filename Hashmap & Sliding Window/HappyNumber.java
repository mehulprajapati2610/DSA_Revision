public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println ( n + " is HappyNumber? " + isHappy ( n ) );
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext ( n );

        while (fast != 1 && slow != fast) {
            slow = getNext ( slow );
            fast = getNext ( getNext ( fast ) );
        }

        return fast == 1;
    }

    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            totalSum += d * d;
            n = n / 10;
        }
        return totalSum;
    }
}
