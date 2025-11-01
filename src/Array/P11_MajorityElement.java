package Array;
import java.util.Arrays;

public class P11_MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length / 2;
        return nums[len];

    }

    public static void main(String[] args) {
        int[] arr = { 2,2,1,1,1,2,2 };
        System.out.println(majorityElement(arr));
    }

}
