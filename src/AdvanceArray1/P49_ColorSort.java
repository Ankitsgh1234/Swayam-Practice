package AdvanceArray1;

public class P49_ColorSort {

    public static void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i:nums){
            if(i==0){
                zero++;
            }
            if(i==1){
                one++;
            }
            if(i==2){
                two++;
            }
        }
        int i=0;

        while(zero!=0){
            nums[i]=0;
            zero--;
            i++;
        }
        while(one!=0){
            nums[i]=1;
            one--;
            i++;
        }
        while(two!=0){
            nums[i]=2;
            two--;
            i++;
        }


    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
