// Last updated: 8/2/2025, 11:56:03 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> lis = new ArrayList<>();
            int len = qu.size();
            for(int i=0 ; i<len ; i++){
                TreeNode x = qu.poll();
                lis.add(x.val);
                if(x.left!=null) qu.add(x.left);
                if(x.right!=null) qu.add(x.right);
            }
            ans.add(lis);
        }
        return ans;
    }
}