/*
 * PROBLEM: Reverse Linked List
 * STATEMENT: Ek singly linked list ka head pointer diya hai. Aapko is list ko reverse (ulta) karna hai aur nayi reversed list ka head return karna hai.
 * EXAMPLE: Head -> [1] -> [2] -> [3] -> [4] -> [5] -> NULL
 * Output: Head -> [5] -> [4] -> [3] -> [2] -> [1] -> NULL
 * CONSTRAINTS: Nodes ki ginti 0 se 5000 ke beech ho sakti hai. Node value -5000 se 5000.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode ( 1 );
        head.next = new ListNode ( 2 );
        head.next.next = new ListNode ( 3 );

        System.out.print ("original List: ");
        printList ( head );

        ListNode newHead = reverseList ( head );
        System.out.print ("reversed List: ");
        printList ( newHead );
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;

        while(curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print (temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println ("NULL");
    }

}
