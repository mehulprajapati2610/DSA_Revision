/*
 * PROBLEM: Linked List Cycle
 * STATEMENT: Ek singly linked list ka head diya hai. Aapko check karna hai ki kya is list mein koi cycle (loop) exist karti hai ya nahi. Agar koi node dobara ghum kar kisi piche wale node par connect ho jata hai, toh use cycle kehte hain. Loop hone par true return karo, nahi toh false.
 * EXAMPLE: [3] -> [2] -> [0] -> [-4]
 * ^              |
 * |______________|  (Node -4 wapas Node 2 ko point kar raha hai)
 * Output: true
 * CONSTRAINTS: Nodes ki ginti 0 se 10^4 ho sakti hai.
 */

public class DetectCycle {

    public static boolean cyclePresent(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode ( 3 );
        ListNode node2 = new ListNode ( 2 );
        ListNode node3 = new ListNode ( 0 );
        ListNode node4 = new ListNode ( -4 );

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println ( "Cycle is Present? : " + cyclePresent ( head ) );
    }


}
