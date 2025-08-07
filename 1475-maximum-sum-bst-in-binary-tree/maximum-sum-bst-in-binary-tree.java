/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNod'e right;
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
    int ans=0;
    public int maxSumBST(TreeNode root) {
        fun(root);
        return ans;
    }
    
    public bst fun(TreeNode root){
        if(root==null) return new bst();
        bst x = fun(root.left);
        bst y = fun(root.right);
        bst me = new bst();
        me.isBst = x.isBst && y.isBst && (x.max<root.val && y.min>root.val);
        if(me.isBst){
            me.max = Math.max(root.val,y.max);
            me.min = Math.min(root.val,x.min);
            me.sum = root.val + x.sum + y.sum;
            ans = Math.max(ans,(int)me.sum);
        }
        return me;
    }
    private class bst{
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long sum=0;
        boolean isBst = true;
    }
}