package BinaryTree3;


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class P66_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // both null → same
        if (p == null && q == null) return true;

        // one null, one not → different
        if (p == null || q == null) return false;

        // values differ → different
        if (p.val != q.val) return false;

        // check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // 🌳 First tree
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // 🌳 Second tree (same as p)
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        // Uncomment next lines to test a "different" tree
        // q.right = new TreeNode(4); // makes it different

        P66_SameTree obj = new P66_SameTree();
        boolean result = obj.isSameTree(p, q);

        System.out.println("Are the two trees the same? " + result);
    }
}

