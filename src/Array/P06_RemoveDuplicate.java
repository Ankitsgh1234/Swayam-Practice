public class P06_RemoveDuplicate {
    
    public static int removeDuplicates(int[] nums) {
        int k=1;
        if(nums.length==0)
        return 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
        
    }
    public static void main(String[] args) {
        int[] arr={2,10,7,5,5,4,1,1,1,8,6};
       System.out.println( removeDuplicates(arr));
    }
}


