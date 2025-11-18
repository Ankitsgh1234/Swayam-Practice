package HashMapSlidingWindow;

import java.util.Arrays;

public class P80_LongestConsequtivSubSequence {

    public static int longestConsecutive(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        int n=nums.length;
        Arrays.sort(nums);
        int sum=1;
        int max=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==(nums[i-1]+1))
            {
                sum++;
                max=Math.max(max,sum);
            }
            else{
                sum=1;
            }

        }
        return max;
        
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1,3,5,6,7,8,9,0};
       
            System.out.print(longestConsecutive(nums1));
        
    }
}

