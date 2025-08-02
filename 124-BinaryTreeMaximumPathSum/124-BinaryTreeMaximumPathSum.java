// Last updated: 8/2/2025, 11:55:55 PM
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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        int max = fun(root);
        return Math.max(max,ans);
    }
    public int fun(TreeNode root){
        if(root==null) return 0;
        // max sum from left side
        int x = fun(root.left);

        // max sum from right side
        int y = fun(root.right);

        // comparing from left+itseld+right
        ans = Math.max(ans, root.val+x+y);

        // comparing from only itself
        ans = Math.max(ans,root.val);
        // comparing from x+itself aomparing from itself+y
        ans = Math.max(ans,Math.max(root.val+x,root.val+y));

        // returning max from (one from two)(left right) + itself
        return Math.max(root.val,Math.max(x+root.val,y+root.val));
    }
}