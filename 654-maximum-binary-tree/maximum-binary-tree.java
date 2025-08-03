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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length);
    }

    public TreeNode construct(int[] nums , int start,int end){
        if(start>=end) return null;
        TreeNode root = new TreeNode();
        // divide and conquer just divide by max value
        int val = maxIndex(nums,start,end);
        root.val = nums[val];
        root.left = construct(nums,start,val);
        root.right = construct(nums,val+1,end);
        return root;
    }

    public int maxIndex(int[] nums, int start , int end){
        if(start==end) return start;
        int max=start;
        for(int i=start ; i<end ; i++){
            if(nums[max]<nums[i]) max=i;
        }
        return max;
    }
}