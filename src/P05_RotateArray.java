public class P05_RotateArray {

    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[(i+k)%n]=nums[i];
            
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,10,7,5,4,1,8,6};
    rotate(arr,3);
    }
}


