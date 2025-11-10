package BinaryTree4;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class P69_HasPathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return sum(root, targetSum);
    }

    public static boolean sum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        sum -= root.val;

        // ✅ if leaf node, check if the path sum matches
        if (root.left == null && root.right == null) {
            return sum == 0;
        }

        // ✅ check both sides recursively
        return sum(root.left, sum) || sum(root.right, sum);
    }

    public static void main(String[] args) {
        /*
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        P69_HasPathSum obj = new P69_HasPathSum();
        int target = 22;

        boolean result = obj.hasPathSum(root, target);
        System.out.println("Has path with sum " + target + "? " + result);
    }
}
