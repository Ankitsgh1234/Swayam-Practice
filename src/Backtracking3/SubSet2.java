package Backtracking3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        Solution sol = new Solution();
        List<List<Integer>> result = sol.subsetsWithDup(nums);

        System.out.println("Subsets:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // sort to handle duplicates
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));  // add subset

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates at the same level
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);                 // choose
            backtrack(i + 1, nums, current, result); // explore
            current.remove(current.size() - 1);   // unchoose
        }
    }

}
