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
    public TreeNode pruneTree(TreeNode root) {
        if(!check(root)) return null;
        return root;
    }
    public boolean check(TreeNode root){
        if(root==null) return false;
        boolean flag = check(root.left);
        if(!flag){
            root.left = null;
        }
        boolean fl = check(root.right);
        if(!fl){
            root.right = null;
        }
        return (flag || fl || (root.val==1));
    }
}