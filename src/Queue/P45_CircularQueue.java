package Queue;

public class P45_CircularQueue {

    public static class CQueue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[4];
        int n = arr.length;

        // ✅ ADD element (Enqueue)
        public void add(int val) {
            if (size == n) {
                System.out.println("Queue is full");
                return;
            }

            // First element
            if (size == 0) {
                f = 0;
                r = 0;
                arr[r] = val;
            }
            // If rear is at last index but front is not 0 (wrap manually)
            else if (r == n - 1 && f != 0) {
                r = 0; // wrap rear to start
                arr[r] = val;
            }
            // Normal case
            else {
                r++;
                arr[r] = val;
            }
            size++;
        }

        // ✅ REMOVE element (Dequeue)
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int val = arr[f];
            arr[f] = 0; // optional: clear value

            // If front is at last index
            if (f == n - 1) {
                f = 0; // wrap around to 0
            }
            // Normal case
            else {
                f++;
            }

            size--;

            // If queue becomes empty
            if (size == 0) {
                f = -1;
                r = -1;
            }

            return val;
        }

        // ✅ FRONT element (peek)
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }

        // ✅ DISPLAY (no modulus)
        public void Display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Queue: ");
            if (r >= f) {
                // Simple print when rear is ahead
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                // Wrap-around case: print till end, then from start
                for (int i = f; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    // ✅ MAIN — Test your version
    public static void main(String[] args) {
        CQueue q = new CQueue();

        q.add(52);
        q.add(54);
        q.add(42);
        q.add(2);
        q.Display();

        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
        q.Display();

        q.add(99);
        q.add(100);
        // q.add(200);
        q.Display();

        System.out.println("Front: " + q.peek());
    }
}
