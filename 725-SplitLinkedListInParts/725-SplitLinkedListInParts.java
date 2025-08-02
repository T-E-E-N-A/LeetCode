// Last updated: 8/2/2025, 11:34:32 PM
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        if(head==null) return ans;
        ListNode slow = head;
        int size=0;
        while(slow!=null){
            slow = slow.next;
            size++;
        }
        int len = size/k;
        int extra = size%k;
        slow = head;
        for(int i=0 ; i<extra ; i++){
            ans[i] = slow;
            slow = split(slow , len+1);
        }
        for(int i=extra ; i<k ; i++){
            ans[i] = slow;
            slow = split(slow,len);
        }
        return ans;
    }
    public ListNode split(ListNode head , int len){
        if(head==null) return null;
        ListNode temp = head;
        for(int i=0 ; i<len-1 ; i++){
            temp = temp.next;
        }
        if(temp==null) return null;
        ListNode ans = temp.next;
        temp.next = null;
        return ans;
    }
}