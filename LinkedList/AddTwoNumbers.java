/*
 * PROBLEM: Add Two Numbers
 * STATEMENT: Do non-empty linked lists di hain jo do non-negative integers ko represent karti hain. Numbers ke digits REVERSE order mein store hain (yaani units place ka digit head par hai). Aapko dono numbers ko add karna hai aur sum ko ek nayi linked list ke roop mein return karna hai.
 * EXAMPLE: l1 = [2] -> [4] -> [3] -> NULL (yaani 342)
 * l2 = [5] -> [6] -> [4] -> NULL (yaani 465)
 * Output: [7] -> [0] -> [8] -> NULL (yaani 342 + 465 = 807, reverse mein: 7 -> 0 -> 8)
 * CONSTRAINTS: Nodes ki ginti 1 se 100 ke beech hogi, 0 <= Node.val <= 9.
 */

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode ( 2 );
        l1.next = new ListNode ( 4 );
        l1.next.next = new ListNode ( 3 );

        ListNode l2 = new ListNode ( 5 );
        l2.next = new ListNode ( 6 );
        l2.next.next = new ListNode ( 4 );

        ListNode result = addTwoNumbers ( l1, l2 );
        System.out.print ( "Sum of lists: " );
        printList ( result );
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode ( 0 );
        int carry = 0;
        ListNode curr = dummy;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = ( l1 != null ) ? l1.val : 0;
            int val2 = ( l2 != null ) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            curr.next = new ListNode ( sum % 10 );
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
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
