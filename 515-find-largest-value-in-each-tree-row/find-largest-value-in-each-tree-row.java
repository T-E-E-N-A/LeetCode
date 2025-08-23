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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> lis = new ArrayList<>();
        if(root==null) return lis;
        while(!q.isEmpty()){
            int n = q.size();
            int max= Integer.MIN_VALUE;
            for(int i=0 ; i<n ; i++){
                TreeNode x = q.poll();
                max = Math.max(max,x.val);
                if(x.left!=null) q.add(x.left);
                if(x.right!=null) q.add(x.right);
            }
            lis.add(max);
        }
        return lis;
    }
}