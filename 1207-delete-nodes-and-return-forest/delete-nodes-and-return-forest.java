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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> lis = new ArrayList<>();
        if(fun(lis,to_delete,root)!=null) lis.add(root);
        return lis;
    }
    public TreeNode fun(List<TreeNode> lis,int[] to_delete,TreeNode root){
        if(root==null) return null;
        TreeNode x = fun(lis,to_delete,root.left);
        TreeNode y = fun(lis,to_delete,root.right);
        if(exist(root.val,to_delete)){
            if(x!=null) lis.add(x);
            if(y!=null) lis.add(y);
            return null;
        }
        root.left = x;
        root.right = y;
        return root;
    }
    public boolean exist(int value ,int[] to_delete){
        for(int i=0 ;i<to_delete.length ; i++){
            if(value==to_delete[i]) return true;
        }
        return false;
    }
}