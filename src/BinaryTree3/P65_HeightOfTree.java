package BinaryTree3;

public class P65_HeightOfTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

     public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        // if((root.left==null&&root.right==null)){
        // return 0;
        // }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        e.left = f;
        // Display(root);
        System.out.println(height(root));
       

    }

}
