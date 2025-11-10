package BinarySearchTree;

import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// Class that contains the BST validation logic
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long min, long max) {
        if (node == null) return true;

        // Node value must be within the valid range
        if (node.val <= min || node.val >= max) return false;

        // Recursively validate left and right subtrees
        return isValid(node.left, min, node.val) &&
               isValid(node.right, node.val, max);
    }
}

public class P72_CheckValidBST {

    // Function to build a binary tree from level-order array
    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            TreeNode curr = queue.poll();

            // Add left child
            if (i < arr.length && arr[i] != null) {
                curr.left = new TreeNode(arr[i]);
                queue.add(curr.left);
            }
            i++;

            // Add right child
            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode(arr[i]);
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        System.out.println("Enter node values (use -1 for null):");

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[i] = (val == -1) ? null : val;
        }

        TreeNode root = buildTree(arr);
        Solution sol = new Solution();

        boolean result = sol.isValidBST(root);
        System.out.println("Is the tree a valid BST? " + result);

        sc.close();
    }
}
