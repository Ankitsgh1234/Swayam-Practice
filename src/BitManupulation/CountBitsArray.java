package BitManupulation;

public class CountBitsArray {
    public static int[] countBits(int n) {
        int[] arr = new int[n + 1];
        int c = 0;
        for (int i = 0; i <= n; i++) {
            int j = i;
            while (j != 0) {
                if ((j & 1) == 1) {
                    c++;
                }
                j = j >> 1;
            }
            arr[i] = c;
            c = 0;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr=countBits(5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
