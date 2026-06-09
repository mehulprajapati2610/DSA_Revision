/*
 * PROBLEM: Middle of the Linked List
 * STATEMENT: Ek singly linked list ka head diya hai. Aapko list ka middle (beech wala) node return karna hai. Agar list mein do middle nodes hain (yaani list ki length even hai), toh doosra waala middle node return karo.
 * EXAMPLE 1: [1] -> [2] -> [3] -> [4] -> [5] -> NULL -> Output: Node 3
 * EXAMPLE 2: [1] -> [2] -> [3] -> [4] -> [5] -> [6] -> NULL -> Output: Node 4 (Kyunki 3 aur 4 dono beech mein hain, hume doosra return karna hai)
 * CONSTRAINTS: Nodes ki ginti 1 se 100 ke beech mein hogi.
 */

public class MiddleOfLinkedList {

    public static int middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode ( 1 );
        head.next = new ListNode ( 2 );
        head.next.next = new ListNode ( 3 );
        head.next.next.next = new ListNode ( 4 );
        head.next.next.next.next = new ListNode ( 5 );

        int middle = middleNode ( head );
        System.out.println ( "Middle Value: " + middle );
    }
}
