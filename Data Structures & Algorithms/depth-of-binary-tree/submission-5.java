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
    public void maxHeight(TreeNode root,int depth,int[] maxD)
    {
        if(root==null) return;
        maxD[0] = Math.max(maxD[0],depth);
        maxHeight(root.left,depth+1,maxD);
        maxHeight(root.right,depth+1,maxD);
    }
    public int maxDepth(TreeNode root) {
        int[] maxD = new int[1];
        maxHeight(root,1,maxD);
        return maxD[0];
    }
}
