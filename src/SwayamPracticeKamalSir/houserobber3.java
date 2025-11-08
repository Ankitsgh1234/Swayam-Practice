package SwayamPracticeKamalSir;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rob(TreeNode root) {
        if(root==null){
            return 0;
        }
        int x=robtree(root,true);
        int y=robtree(root,false);
        return Math.max(x,y);
        
    }

    public static int robtree(TreeNode root,boolean check)
    {
        if(root==null){
            return 0;
        }
        else if(check==true){
           int x= robtree(root.left,false);
           int y= robtree(root.right,false);
            return root.val+x+y;
        }
        else{
            int x=robtree(root.left,true);
            int y= robtree(root.right,true);
             return x+y;
        }


    }
}