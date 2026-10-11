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
    public List<Integer> getRightSide(TreeNode root)
    {
        List<Integer> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode curr = null;
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty())
        {
            int lev = q.size();
            for(int i=0;i<lev;i++)
            {
                curr = q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            ans.add(curr.val);
        }
        return ans;
    }
    public List<Integer> rightSideView(TreeNode root) {
        return getRightSide(root);
    }
}
