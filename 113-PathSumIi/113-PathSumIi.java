// Last updated: 8/2/2025, 11:55:58 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        hasPathSum(root,targetSum,ans , new ArrayList<>());
        return ans;
    }
    public void hasPathSum(TreeNode root, int targetSum, List<List<Integer>> ans , List<Integer> ll) {
        if(root==null){
            return;
        }
        if(targetSum-root.val==0){
            if(root.left==null && root.right==null){
                // return true;
                ll.add(root.val);
                ans.add(new ArrayList<>(ll));
                ll.remove(ll.size()-1);
            }
        }
        ll.add(root.val);
        hasPathSum(root.left , targetSum-root.val , ans,ll);
        hasPathSum(root.right , targetSum-root.val,ans,ll);
        ll.remove(ll.size()-1);
    }
}