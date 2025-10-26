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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode thiss = ans;
        int sum=0;
        int carr=0;
        while(l1!=null || l2!=null || carr!=0){
            sum=0;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            if(carr!=0){
                sum += carr;
            }
            carr = sum/10;
            ListNode s = new ListNode();
            s.val = sum%10;
            ans.next = s;
            ans = ans.next;
        }
        return thiss.next;
    }
}