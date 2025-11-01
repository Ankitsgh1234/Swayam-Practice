package Recursion;

public class Print1ToN {
    
  
    public static void pOneToN(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        pOneToN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        pOneToN(5);
    }
}


