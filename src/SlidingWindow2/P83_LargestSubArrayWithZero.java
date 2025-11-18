package SlidingWindow2;

public class P83_LargestSubArrayWithZero {
    public static int maxLength(int arr[]) {
        // code here
        int sum=0;
        int ind=0;
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    ind=j-i+1;
                }
                max=Math.max(ind,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLength(arr));
    }
}


