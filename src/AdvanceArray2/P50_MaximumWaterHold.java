package AdvanceArray2;

import java.util.Arrays;

public class P50_MaximumWaterHold {
    public static int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int sum=0;
        int max=0;
        
        while(l<r){
            int min=Math.min(height[l],height[r]);
            sum=(r-l)*min;
            max=Math.max(max,sum);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }


        return max;
        
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
       

        System.out.println("Max water: " + maxArea(nums1));
    }
}

