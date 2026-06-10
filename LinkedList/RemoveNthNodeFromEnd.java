/*
 * PROBLEM: Remove Nth Node From End of List
 * STATEMENT: Ek linked list ka head aur ek integer 'n' diya hai. Aapko list ke AAKHIR (end) se 'n'-th node ko delete karna hai aur list ka head return karna hai.
 * EXAMPLE: List = [1] -> [2] -> [3] -> [4] -> [5] -> NULL, n = 2
 * Output: [1] -> [2] -> [3] -> [5] -> NULL (Aakhir se doosra node '4' tha, jise hata diya gaya)
 * CONSTRAINTS: Nodes ki ginti 1 se 30 ke beech hogi, 1 <= n <= Nodes Count.
 */

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode ( 1 );
        head.next = new ListNode ( 2 );
        head.next.next = new ListNode ( 3 );
        head.next.next.next = new ListNode ( 4 );
        head.next.next.next.next = new ListNode ( 5 );

        System.out.print ( "Original: " );
        printList ( head );

        ListNode newList = removeNthFromEnd ( head, 2 );
        System.out.print ( "After Removal: " );
        printList ( newList );
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode ( -1 );
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0 ; i < n ; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print ( temp.val + " -> " );
            temp = temp.next;
        }
        System.out.println ( "NULL" );
    }
}
