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
    public void getKthSmallest(TreeNode root,int k,PriorityQueue<Integer> pq)
    {
        if(root==null) return;
        pq.add(root.val);
        if(pq.size()>k) pq.poll();
        getKthSmallest(root.left,k,pq);
        getKthSmallest(root.right,k,pq);
    }
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        getKthSmallest(root,k,pq);
        return pq.peek();
    }
}
