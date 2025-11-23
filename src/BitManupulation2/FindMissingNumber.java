package BitManupulation2;

public class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        int sum=0;
        int len=nums.length;
        int result=(len*(len+1))/2;
        for (int i:nums){
            sum+=i;

        }
        return result-sum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,3,0};
        System.out.println(missingNumber(arr));
    }

}
