package HashMapImplementation;

public class P73_Introduction {

    // -------------------------------
    // MyHashMap Implementation
    // -------------------------------
    static class MyHashMap {

        private static class Node {
            int key, value;
            Node next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final int SIZE = 10000;
        private Node[] buckets;

        public MyHashMap() {
            buckets = new Node[SIZE];
        }

        private int hash(int key) {
            return key % SIZE;
        }

        public void put(int key, int value) {
            int index = hash(key);

            if (buckets[index] == null) {
                buckets[index] = new Node(key, value);
                return;
            }

            Node curr = buckets[index];

            while (curr != null) {
                if (curr.key == key) { 
                    curr.value = value; // update value
                    return;
                }
                if (curr.next == null) break;
                curr = curr.next;
            }

            curr.next = new Node(key, value); // insert new node
        }

        public int get(int key) {
            int index = hash(key);
            Node curr = buckets[index];

            while (curr != null) {
                if (curr.key == key) return curr.value;
                curr = curr.next;
            }

            return -1;
        }

        public void remove(int key) {
            int index = hash(key);
            Node curr = buckets[index];

            if (curr == null) return;

            if (curr.key == key) { 
                buckets[index] = curr.next; 
                return;
            }

            Node prev = null;

            while (curr != null) {
                if (curr.key == key) {
                    prev.next = curr.next;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
        }
    }

    // -------------------------------
    // Main Method for Testing
    // -------------------------------
    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);

        System.out.println(map.get(1)); // Output: 10
        System.out.println(map.get(3)); // Output: -1

        map.put(2, 200);
        System.out.println(map.get(2)); // Output: 200

        map.remove(2);
        System.out.println(map.get(2)); // Output: -1
    }
}
