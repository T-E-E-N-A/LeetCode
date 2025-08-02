// Last updated: 8/2/2025, 11:56:01 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int k=0;
        while(!qu.isEmpty()){
            int n = qu.size();
            List<Integer> lis = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                TreeNode x = qu.poll();
                lis.add(x.val);
                if(x.left!=null) qu.add(x.left);
                if(x.right!=null) qu.add(x.right);
            }
            if(k%2!=0) Collections.reverse(lis);
            ans.add(lis);
            k++;
        }
        return ans;
    }
}