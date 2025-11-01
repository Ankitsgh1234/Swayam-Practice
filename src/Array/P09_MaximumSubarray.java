package Array;
public class P09_MaximumSubarray {
      public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
   
   }
     public static void main(String[] args) {
        int[] arr={2,10,-7,5,4,1,8,6};
       System.out.println( maxSubArray(arr));
    }

}
