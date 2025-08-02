// Last updated: 8/2/2025, 11:56:13 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode t1 = new ListNode();
        t1.next = head;
        ListNode t2 = head.next;
        ListNode ans = t1;
        ListNode yah = ans;
        t1 = t1.next;
        boolean flag=false;
        while(t2!=null){
            if(t1.val==t2.val){
                flag = true;
                t2 = t2.next;
            }else{
                if(flag){
                    flag = false;
                    t1 = t2;
                    t2 = t2.next;
                }else{
                    ans.next = t1;
                    ans = ans.next;
                    t1 = t2;
                    t2 = t2.next;
                }
            }
        }
        if(!flag){
            ans.next = t1;
        }else{
            ans.next=null;
        }
        return yah.next;
    }
}