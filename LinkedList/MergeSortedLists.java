/*
 * PROBLEM: Merge Two Sorted Lists
 * STATEMENT: Do sorted linked lists 'list1' aur 'list2' ke heads diye hain. Dono ko mila kar ek nayi sorted linked list banani hai. Nayi list alag se naye nodes bana kar nahi, balki purane nodes ke links (pointers) ko aapas mein jod kar (in-place) banani hai.
 * EXAMPLE: list1 = [1] -> [2] -> [4] -> NULL, list2 = [1] -> [3] -> [4] -> NULL
 * Output: [1] -> [1] -> [2] -> [3] -> [4] -> [4] -> NULL
 * CONSTRAINTS: Nodes ki ginti 0 se 50 ke beech hogi. Values -100 se 100 sorted order mein hain.
 */

public class MergeSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode ( -1 );
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
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

    public static void main(String[] args) {
        ListNode list1 = new ListNode ( 1 );
        list1.next = new ListNode ( 2 );
        list1.next.next = new ListNode ( 4 );

        ListNode list2 = new ListNode ( 1 );
        list2.next = new ListNode ( 3 );
        list2.next.next = new ListNode ( 4 );

        ListNode mergedHead = mergeTwoLists ( list1, list2 );
        System.out.print ( "Merged Sorted List: " );
        printList ( mergedHead );
    }
}