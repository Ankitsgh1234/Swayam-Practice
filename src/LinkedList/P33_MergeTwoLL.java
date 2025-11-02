package LinkedList;

// Simple Linked List Node class
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Solution class with merge method
class MergeLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If one list is empty, return the other
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Dummy node to start the new list
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining elements
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next;
    }
}

// Main class to test
public class P33_MergeTwoLL {

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create first list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Create second list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merge the lists
        MergeLL sol = new MergeLL();
        ListNode merged = sol.mergeTwoLists(list1, list2);

        // Print result
        System.out.print("Merged List: ");
        printList(merged);
    }
}
