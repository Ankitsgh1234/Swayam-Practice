package BinaryTree3;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class P67_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        // Case when both children are null
        if (root.left == null && root.right == null) {
            return true;
        }

        // Invert left subtree
        invertTree(root.left);

        // Compare with right subtree
        return isSameTree(root.left, root.right);
    }

    // --- Your invertTree method (kept same, just cleaned up) ---
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // Swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recurse
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    // --- Your isSameTree method (same as before, but using && instead of &) ---
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // --- Main method to test ---
    public static void main(String[] args) {
        /*
              1
             / \
            2   2
           / \ / \
          3  4 4  3
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        P67_SymmetricTree obj = new P67_SymmetricTree();
        boolean result = obj.isSymmetric(root);

        System.out.println("Is tree symmetric? " + result);
    }
}
