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
    public int maxHeightOfTree(TreeNode root)
    {
        if(root==null) return 0;
        int lh = maxHeightOfTree(root.left);
        int rh = maxHeightOfTree(root.right);
        return 1+Math.max(lh,rh);
    }
    int maxi = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return maxi;
        int lh = maxHeightOfTree(root.left);
        int rh = maxHeightOfTree(root.right);
        maxi = Math.max(maxi,lh+rh);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return maxi;
    }
}
