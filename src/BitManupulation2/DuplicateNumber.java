package BitManupulation2;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> s=new HashSet<>();

        for(int i:nums){
            if(s.contains(i)){
                return i;
            }
            s.add(i);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}

