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

public class P60_CreatingBinaryTree {

    public TreeNode createBinaryTree(int[][] descriptions) {
        // Map to store value → TreeNode
        HashMap<Integer, TreeNode> map = new HashMap<>();
        // Set to keep track of all child nodes
        HashSet<Integer> childNodes = new HashSet<>();

        // Step 1: Build all nodes and connect them
        for (int[] desc : descriptions) {
            int parent = desc[0];
            int child = desc[1];
            int isLeft = desc[2];

            // Create parent and child nodes if they don't exist
            map.putIfAbsent(parent, new TreeNode(parent));
            map.putIfAbsent(child, new TreeNode(child));

            // Connect parent to child
            if (isLeft == 1) {
                map.get(parent).left = map.get(child);
            } else {
                map.get(parent).right = map.get(child);
            }

            // Mark this node as a child
            childNodes.add(child);
        }

        // Step 2: The root is the node which is never a child
        for (int[] desc : descriptions) {
            int parent = desc[0];
            if (!childNodes.contains(parent)) {
                return map.get(parent); // this is the root
            }
        }

        return null;
    }

    // Helper function to print tree (Preorder Traversal)
    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    // Main function to test
    public static void main(String[] args) {
        int[][] descriptions = {
            {20, 15, 1},
            {20, 17, 0},
            {15, 10, 1},
            {15, 16, 0}
        };

        P60_CreatingBinaryTree obj = new P60_CreatingBinaryTree();
        TreeNode root = obj.createBinaryTree(descriptions);

        System.out.println("Preorder Traversal of Created Tree:");
        printTree(root);
    }
}
