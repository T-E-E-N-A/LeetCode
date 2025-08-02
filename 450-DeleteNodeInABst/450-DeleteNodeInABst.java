// Last updated: 8/2/2025, 11:35:15 PM
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val==key){
            // one left child only or no child 
            if(root.right==null) return root.left;
            // right child exists only
            if(root.left==null) return root.right;
            
            // no one is null - both child exists
            int val = findMax(root.left);
            root.left = deleteNode(root.left,val);
            root.val = val;
        }else if(root.val>key){
            root.left = deleteNode(root.left,key);
        }else {
            root.right = deleteNode(root.right,key);
        }
        return root;
    }
    public int findMax(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,findMax(root.right));
    }
}