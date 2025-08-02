// Last updated: 8/2/2025, 11:32:55 PM
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
    public int getDecimalValue(ListNode head) {
        int ans=0;
        while(head.next!=null){
            ans = ans*2 + 2*(head.val);
            head = head.next;
        }
        if(head!=null) ans = ans + head.val;
        return ans;
    }
}