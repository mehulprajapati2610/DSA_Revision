/*
 * PROBLEM: Merge K Sorted Lists
 * STATEMENT: Aapko 'K' linked lists ka ek array diya hai, jahan har ek linked list pehle se hi ascending order me SORTED hai.
 * Aapko un saari sorted lists ka use karke ek SINGLE SORTED LINKED LIST banani hai aur uska head return karna hai.
 * EXAMPLE: lists = [[1->4->5], [1->3->4], [2->6]]
 * Output: 1->1->2->3->4->4->5->6
 */

import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeKLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode ( 1 );
        list1.next = new ListNode ( 4 );
        list1.next.next = new ListNode ( 5 );

        ListNode list2 = new ListNode ( 1 );
        list2.next = new ListNode ( 3 );
        list2.next.next = new ListNode ( 4 );

        ListNode list3 = new ListNode ( 2 );
        list3.next = new ListNode ( 6 );

        ListNode[] lists = {list1, list2, list3};

        ListNode mergedHead = mergeKLists ( lists );

        System.out.print ( "Mereged Sorted List: " );
        printList ( mergedHead );

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<> ( (a, b) -> a.val - b.val );

        for (ListNode rootNode : lists) {
            if (rootNode != null) {
                minHeap.add ( rootNode );
            }
        }

        ListNode dummy = new ListNode ( -1 );
        ListNode current = dummy;

        while (!minHeap.isEmpty ()) {
            ListNode smallestNode = minHeap.poll ();

            current.next = smallestNode;
            current = current.next;

            if (smallestNode.next != null) {
                minHeap.add ( smallestNode.next );
            }
        }

        return dummy.next;
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print ( node.val + " -> " );
            node = node.next;
        }
        System.out.println ( " NULL" );
    }
}
