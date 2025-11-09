package Trees;
import java.util.*;

// Simple TreeNode class
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class P62_InorderTraversal{

    // Function to build a binary tree from an array (-1 means null)
    public static TreeNode buildTree(int[] arr, int i) {
        if (i >= arr.length || arr[i] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(arr[i]);
        root.left = buildTree(arr, 2 * i + 1);   // Left child index
        root.right = buildTree(arr, 2 * i + 2);  // Right child index

        return root;
    }

    // Recursive preorder helper
    public static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    // Main preorder function
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void main(String[] args) {
        // Example tree: [1, 2, 3, -1, -1, 4, 5]
        // Structure:
        //        1
        //       / \
        //      2   3
        //         / \
        //        4   5

        int[] arr = {1, 2, 3, -1, -1, 4, 5};

        // Build tree from array
        TreeNode root = buildTree(arr, 0);

        // Preorder traversal
        P62_InorderTraversal obj = new P62_InorderTraversal();
        List<Integer> ans = obj.inorderTraversal(root);

        System.out.println("Preorder Traversal: " + ans);
    }
}
