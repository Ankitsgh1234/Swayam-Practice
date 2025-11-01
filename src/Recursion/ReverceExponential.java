package Recursion;

public class ReverceExponential {
   
    public static  int powerOfReverse(int n) {
        int rev = reverse(n);
        return power(n, rev);
    }

    // Function to reverse the number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    // Recursive power function
    public static int power(int n, int r) {
        if (r == 0) {
            return 1;
        }
        return n * power(n, r - 1);
    }

    // For testing
    public static void main(String[] args) {
        // Solution s = new Solution();
        System.out.println(powerOfReverse(2));   // 4
        System.out.println(powerOfReverse(10));  // 10
        System.out.println(powerOfReverse(3));   // 27
    }
}


