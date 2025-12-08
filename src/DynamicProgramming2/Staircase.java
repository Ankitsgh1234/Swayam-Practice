package DynamicProgramming2;

public class Staircase {
     public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb = " + climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 3) return n;

        int a = 2;
        int b = 3;

        for (int i = 4; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}
