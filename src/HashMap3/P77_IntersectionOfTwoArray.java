package HashMap3;

import java.util.ArrayList;

public class P77_IntersectionOfTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
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
        return intArray;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[]nums2 = {2,2};
        int[] arr=intersection(nums1, nums2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
