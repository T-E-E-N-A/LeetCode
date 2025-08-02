// Last updated: 8/2/2025, 11:33:42 PM
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return symmetric(root1,root2);
    }
    public boolean symmetric(TreeNode root1 , TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        boolean flip = symmetric(root1.left,root2.right)&& symmetric(root1.right,root2.left);
        boolean noFlip = symmetric(root1.left,root2.left)&& symmetric(root1.right,root2.right);
        return flip || noFlip;
    }
}