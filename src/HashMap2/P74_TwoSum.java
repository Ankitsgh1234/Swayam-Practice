package HashMap2;

import java.util.HashMap;

public class P74_TwoSum {

    // --------------------------
    // Two Sum Method Using HashMap
    // --------------------------
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // (LeetCode guarantees one solution)
    }

    // --------------------------
    // Main Method for Testing
    // --------------------------
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]); 
        // Expected output: 0, 1
    }
}
