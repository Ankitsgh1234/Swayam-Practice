package BackTracking2;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
      public static void main(String[] args) {
        int n = 4;
        int k = 2;

        Solution sol = new Solution();
        List<List<Integer>> result = sol.combine(n, k);

        System.out.println("Combinations:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
        // If size reached k, store the combination
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Backtracking loop
        for (int i = start; i <= n; i++) {
            current.add(i);                 // choose
            backtrack(i + 1, n, k, current, result); // explore deeper
            current.remove(current.size() - 1);      // unchoose (backtrack)
        }
    }
}
