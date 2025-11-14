package HashMap2;

public class P76_MissingNumber {
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
        int[] arr={0,1,3,4};
        System.out.println(missingNumber(arr));

    }

}
