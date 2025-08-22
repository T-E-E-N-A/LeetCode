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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));
        int ans=0;
        while(!q.isEmpty()){
            pair start = q.peek();
            int n=q.size();
            pair x = q.peek();
            for(int i=0 ; i<n ; i++){
                x = q.poll();
                if(x.node.left!=null) q.add(new pair(x.node.left,x.idx*2+1));
                if(x.node.right!=null) q.add(new pair(x.node.right,x.idx*2+2));
            }
            ans = Math.max(ans,x.idx-start.idx+1);
        }
        return ans;
    }
    private class pair{
        TreeNode node;
        int idx;
        pair(TreeNode node,int idx){
            this.node = node;
            this.idx = idx;
        }
    }
}