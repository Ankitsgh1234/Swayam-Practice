package Recursion;

public class P20_Factorial {
    
   public static void main(String[] args) {
    
        // code here'
        System.out.println(fact(10));
        
    }
    public static int fact(int n){
        if(n==1||n==0){
            return n;
        }
        return fact(n-1)+fact(n-2);
    }
}

