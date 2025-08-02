// Last updated: 8/2/2025, 11:34:53 PM
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
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root).dt;
    }
    public diaPair dia(TreeNode root){
        if(root==null){
            return new diaPair();
        }
        diaPair ldp = dia(root.left);
        diaPair rdp = dia(root.right);
        int sd = ldp.ht + rdp.ht + 2;
        diaPair sdp = new diaPair();
        sdp.dt = Math.max(sd,Math.max(rdp.dt,ldp.dt));
        sdp.ht = Math.max(ldp.ht,rdp.ht)+1;
        return sdp;
    }
    class diaPair{
        int dt = 0;
        int ht = -1;
    }
}