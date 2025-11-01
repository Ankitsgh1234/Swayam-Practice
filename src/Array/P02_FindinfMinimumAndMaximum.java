package Array;
public class P02_FindinfMinimumAndMaximum {
    
    public static int minimumDeletions(int[] nums) {
        int minind=-1;
        int maxind=-1;
        int n=nums.length;
        if(nums.length<=2){
            return nums.length;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minind=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxind=i;
            }
        }
        int maxi=Math.max(maxind,minind);
        int mini=Math.min(maxind,minind);
        int a=n-mini;
        int b=maxi+1;
        int c=(n-maxi)+mini+1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return Math.min(a,Math.min(b,c));

        
    }
    public static void main(String[] args) {
        int[] arr={2,10,7,5,4,1,8,6};
       System.out.println( minimumDeletions(arr));
    }
}


