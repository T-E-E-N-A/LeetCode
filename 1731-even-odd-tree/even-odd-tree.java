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
    public boolean isEvenOddTree(TreeNode root) {
        int odd=1;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int n = qu.size();
            for(int i=0 ; i<n ; i++){
                TreeNode x = qu.poll();
                if(x.val%2!=odd) return false;
                if(odd==0 && x.val>=min){
                    return false;
                }else if(odd==1 && x.val<=max) return false;
                if(x.left!=null) qu.add(x.left);
                if(x.right!=null) qu.add(x.right);
                min = Math.min(min,x.val);
                max = Math.max(max,x.val);
            }
            odd = (odd+1)%2;
        }
        return true;
    }
}