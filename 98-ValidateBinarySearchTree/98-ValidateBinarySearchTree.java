// Last updated: 8/2/2025, 11:56:05 PM
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
    public boolean isValidBST(TreeNode root) {
        return fun(root).isBst;
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
        }
        return me;
    }
    private class bst{
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        boolean isBst = true;
    }
}