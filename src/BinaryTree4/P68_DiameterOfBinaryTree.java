package BinaryTree4;

public class P68_DiameterOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
        int throughRoot = height(root.left) + height(root.right);

        return Math.max(throughRoot, Math.max(leftDia, rightDia));
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        // Example tree:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        P68_DiameterOfBinaryTree obj = new P68_DiameterOfBinaryTree();
        int result = obj.diameterOfBinaryTree(root);
        System.out.println("Diameter of Tree: " + result);
    }
}
