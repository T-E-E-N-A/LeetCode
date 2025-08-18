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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return create(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode create(int[] in, int ist , int iend, int[] post,int pst,int pend){
        if(ist>iend || pst>pend) return null;
        if(ist==iend) return new TreeNode(in[ist],null,null);
        TreeNode root = new TreeNode();
        root.val = post[pend];
        // idx is index found in order traversal
        int idx = find(in,ist,iend,post[pend]);

        // idx-ist is len of left tree so pEnd = old postStart + len - 1 (here -1 as last is also included) 
        root.left = create(in,ist,idx-1,post,pst,pst+idx-ist-1);

        // postStart = end of left-tree postEnd +1 
        root.right = create(in,idx+1,iend,post,pst+idx-ist,pend-1);
        return root;
    }
    private int find(int[] in , int start,int end,int val){
        for( ; start<=end ; start++){
            if(in[start]==val) return start;
        }
        return -1;
    }
}