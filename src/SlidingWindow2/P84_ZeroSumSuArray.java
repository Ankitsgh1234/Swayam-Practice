package SlidingWindow2;

public class P84_ZeroSumSuArray {
    
    public static int findSubarray(int[] arr) {
        // code here
        int sum=0;
        int ind=0;
        int max=0;
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    count++;
                }
               
            }
        }
        return count;
    }
     public static void main(String[] args) {
        int[] arr = {0, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(findSubarray(arr));
    }
}



