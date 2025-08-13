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
    public int minCameraCover(TreeNode root) {
        if(cover(root)==-1) c++;
        return c;
    }
    // returning 0 means protected \U0001f643
    // returning -1 means "needs camera"\U0001f97a
    // returning 1 means \U0001f60ei have camera
    public int cover(TreeNode root){
        if(root==null) return 0;
        int x = cover(root.left);
        int y = cover(root.right);
        if(x==-1 || y==-1){
            c++;
            return 1;
        }
        if(x==1 || y==1) return 0;
        return -1;
    }
}