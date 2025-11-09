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

public class P63_PostOrder {

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
    public static void preorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        preorder(root.left, list);
        preorder(root.right, list);
        list.add(root.val);
    }

    // Main preorder function
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
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
        P63_PostOrder obj = new P63_PostOrder();
        List<Integer> ans = obj.preorderTraversal(root);

        System.out.println("Preorder Traversal: " + ans);
    }
}
