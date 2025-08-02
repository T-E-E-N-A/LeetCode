// Last updated: 8/2/2025, 11:55:11 PM
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
class BSTIterator {
    PriorityQueue<Integer> qu = new PriorityQueue<>();
    public BSTIterator(TreeNode root) {
        BSTIterator(root);
    }
    public void BSTIterator(TreeNode root){
        if(root==null) return;
        qu.add(root.val);
        BSTIterator(root.left);
        BSTIterator(root.right);
    }
    
    public int next() {
        return qu.poll();
    }
    
    public boolean hasNext() {
        return !qu.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */