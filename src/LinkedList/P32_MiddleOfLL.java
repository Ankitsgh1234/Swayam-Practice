package LinkedList;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // move fast by 2 and slow by 1
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow points to the middle node
    }
}

public class P32_MiddleOfLL {

    public static void main(String[] args) {
        // Create a simple linked list using insert() method
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        // list.insert(6); // uncomment to test even-length list

        System.out.print("Original List: ");
        list.printList();

        // Find middle node
        Solution sol = new Solution();
        ListNode middle = sol.middleNode(list.head);

        System.out.println("Middle Node Value: " + middle.val);
    }
}

// Helper LinkedList class for easy list creation
class MyLinkedList {
    ListNode head;

    // Insert at end
    public void insert(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print all nodes
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
