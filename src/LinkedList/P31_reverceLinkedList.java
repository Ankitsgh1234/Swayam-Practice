// Easy editable version — Reverse Linked List (with insert method)
package LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    ListNode head;

    // Method to insert at end
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

    // Print the list
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Reverse the list (like LeetCode 206)
    public void reverseList() {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}

public class P31_reverceLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // insert elements
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.print("Original list: ");
        list.printList();

        // reverse
        list.reverseList();

        System.out.print("Reversed list: ");
        list.printList();
    }
}
