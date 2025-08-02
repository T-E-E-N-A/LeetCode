// Last updated: 8/2/2025, 11:55:05 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lis = new ArrayList<>();
        if(root==null) return lis;
        fun(root,lis,0);
        return lis;
    }
    public void fun(TreeNode root,List<Integer> lis,int count){
        if(root==null) return;
        // length will always be same as count b'coz at each level we need one only
        if(lis.size()==count){
            lis.add(root.val);
        }
        fun(root.right , lis,count+1);
        fun(root.left , lis,count+1);
    }
}