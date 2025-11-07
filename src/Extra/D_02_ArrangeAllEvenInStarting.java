package Extra;
import java.util.Scanner;

public class D_02_ArrangeAllEvenInStarting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int s = 0;
        int e = 1;

        while (e < n) {

            if (arr[s] % 2 == 0) {

                s++;
            } else if (arr[e] % 2 == 1) {
                e++;
            } else if (arr[e] % 2 == 0) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e++;
                s++;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
