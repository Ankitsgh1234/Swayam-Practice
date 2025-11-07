package Extra;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[2 * n];
            int firstFree = 0; // pointer to the next empty slot

            for (int x = n; x >= 1; x--) {
                // find first empty position
                while (arr[firstFree] != 0) firstFree++;

                int i = firstFree;
                // find a j > i such that j - i is multiple of x and arr[j] is empty
                int j = i + x;
                while (j < 2 * n && arr[j] != 0) j += x;

                // guaranteed to find because problem guarantees a solution
                arr[i] = x;
                arr[j] = x;
            }

            for (int i = 0; i < 2 * n; i++) {
                sb.append(arr[i]);
                if (i + 1 < 2 * n) sb.append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
        sc.close();
    }
}
