package Recursion;

public class P19_SumOfArray {
   
    public static void main(String[] args) {
        
    int [] arr={1,2,3,5,9,7,8,6,4};
        // code here
        System.out.println( sum(arr,0,0));
        
        
    }
    public static int sum(int arr[],int i,int sum){
        if(i>=arr.length){
            return sum;
        }
        return arr[i]+sum(arr,i+1,sum);
    }
}


