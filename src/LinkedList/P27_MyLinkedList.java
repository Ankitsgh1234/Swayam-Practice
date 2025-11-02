package LinkedList;
public class P27_MyLinkedList {

    // Inner Node class
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int size;

    // Constructor
    public void MyLinkedList() {
        head = null;
        size = 0;
    }

    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        int i = 0;
        Node p = head;
        while (i < index) {
            i++;
            p = p.next;
        }
        return p.val;
    }

    // Add at head
    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

    // Add at tail
    public void addAtTail(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size++;
    }

    // Add at index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        int i = 0;
        Node temp = head;
        Node nwnode = new Node(val);

        while (i < index - 1) {
            i++;
            temp = temp.next;
        }

        nwnode.next = temp.next;
        temp.next = nwnode;
        size++;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
        } else {
            int i = 0;
            Node temp = head;
            while (i < index - 1) {
                i++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    // Utility: Print the LinkedList (for VS Code testing)
    public void printList() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ---------------------------
    // MAIN METHOD for VS Code run
    // ---------------------------
    public static void main(String[] args) {
        P27_MyLinkedList list = new P27_MyLinkedList();

        list.addAtHead(1);
        list.printList(); // [1]

        list.addAtTail(3);
        list.printList(); // [1, 3]

        list.addAtIndex(1, 2);
        list.printList(); // [1, 2, 3]

        System.out.println("Value at index 1: " + list.get(1)); // 2

        list.deleteAtIndex(1);
        list.printList(); // [1, 3]

        System.out.println("Value at index 1 after deletion: " + list.get(1)); // 3
    }
}

