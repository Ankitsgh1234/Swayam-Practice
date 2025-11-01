package Recursion;

public class P18_CountDigit {
    // User function Template for Java
    public static void main(String[] args) {
          System.out.println( count(43, 0,43));
    }
    

    // we pass original n as "orig" to check divisibility correctly
    public static int count(int n, int c, int orig) {
        if (n == 0) {
            return c;
        }

        int digit = n % 10;

        // skip if digit is 0
        if (digit != 0 && orig % digit == 0) {
            c++;
        }

        return count(n / 10, c, orig);
    }
}


