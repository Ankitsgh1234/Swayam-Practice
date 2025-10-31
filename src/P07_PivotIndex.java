
public class P07_PivotIndex {
    
    public static int pivotIndex(int[] nums) {
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
      
    
        int half = 0;
        for (int i = 0; i < n; i++) {
            if ((2 * half) == sum-nums[i]) {
                return i;
            }
            half += nums[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,10,7,5,4,1,8,6};
       System.out.println( pivotIndex(arr));
    }
}


