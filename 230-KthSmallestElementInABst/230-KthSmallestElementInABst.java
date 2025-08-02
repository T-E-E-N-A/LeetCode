// Last updated: 8/2/2025, 11:36:21 PM
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
    int c=0;
    public int kthSmallest(TreeNode root, int k) {
        return answer(root,k);
    }
    public int answer(TreeNode root , int k){
        if(root==null){
            return 0;
        }
        int a = answer(root.left,k);
        if(a!=0) return a;
        c++;
        if(c==k) return root.val;
        int b = answer(root.right,k);
        if(b!=0) return b;
        return 0;
    }
}