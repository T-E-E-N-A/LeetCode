// Last updated: 8/2/2025, 11:34:13 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp = head;
        int c=0,ans=0;
        while(temp!=null){
            int value = temp.val;
            int i=0;
            for(i=0 ; i<nums.length ; i++){
                if(value==nums[i]){
                    if(c==0)
                        ans++;
                    c++;
                    break;
                }
            }
            if(i==nums.length){
                c=0;
            }
            temp = temp.next;
        }
        return ans;
    }
}