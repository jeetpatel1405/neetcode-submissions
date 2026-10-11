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
    int maxDepth = 0;
    public void maxHeight(TreeNode root,int depth)
    {
        if(root==null) return;
        maxDepth = Math.max(maxDepth,depth);
        maxHeight(root.left,depth+1);
        maxHeight(root.right,depth+1);
    }
    public int maxDepth(TreeNode root) {
        maxHeight(root,1);
        return maxDepth;
    }
}
