package BinarySearch1;

public class P53_LowerBound {

    public static int lowerbound(int[] arr , int target){
        int res=arr.length;
        int high=arr.length-1;
        int low=0;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
     public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 6, 7};
       

        System.out.println("Lower bound: " + lowerbound(nums1,5));
    }
}
