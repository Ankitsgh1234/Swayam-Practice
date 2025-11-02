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

// Solution class to remove duplicates from sorted list
class RemoveDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        // Traverse and remove duplicates
        while (temp != null) {
            if (temp.next != null && temp.val == temp.next.val) {
                temp.next = temp.next.next; // Skip duplicate node
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}

// Main class to test
public class P36_removeDuplicate {

    // Helper method to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list manually: 1 -> 1 -> 2 -> 3 -> 3
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(3);

        System.out.print("Original List: ");
        printList(list);

        // Remove duplicates
        RemoveDuplicate sol = new RemoveDuplicate();
        ListNode newHead = sol.deleteDuplicates(list);

        System.out.print("After Removing Duplicates: ");
        printList(newHead);
    }
}
