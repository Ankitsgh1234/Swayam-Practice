package DynamicProgramming2;

public class CountBits {
      public static int[] countBitsPowerOfTwo(int n) {
        int[] dp = new int[n + 1];
        int offset = 1;

        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) {
                offset = i; // update to next power of 2
            }
            dp[i] = dp[i - offset] + 1;
        }

        return dp;
    }

    public static void main(String[] args) {
        int n = 16;

        System.out.println("Method 1: dp[i >> 1] + (i & 1)");
        int[] res1 = countBitsDP(n);
        for (int i = 0; i <= n; i++) {
            System.out.printf("%2d -> %d\n", i, res1[i]);
        }

        System.out.println("\nMethod 2: highest power of two");
        int[] res2 = countBitsPowerOfTwo(n);
        for (int i = 0; i <= n; i++) {
            System.out.printf("%2d -> %d\n", i, res2[i]);
        }
    }
    public static int[] countBitsDP(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }

        return dp;
    }


}
