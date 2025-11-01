package Array;
import java.util.ArrayList;

public class P08_IntersectionOfArray {
    public static void intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&&!a.contains(nums1[i]))
                a.add(nums1[i]);
            }
        }
         int[] intArray = new int[a.size()];
         for(int i=0;i<a.size();i++){
            intArray[i]=a.get(i);
         }
        System.out.println(a);
    }
    public static void main(String[] args) {
        int[] arr={2,10,7,5,4,1,8,6};
        int[] brr={2,10,7,5,4,1,8,6};
        intersection(arr,brr);
    }

}
