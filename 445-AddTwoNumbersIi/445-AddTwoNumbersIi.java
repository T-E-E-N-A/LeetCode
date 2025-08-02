// Last updated: 8/2/2025, 11:35:16 PM
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
        if(l1==null) return l2;
        if(l2==null) return l1;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        ListNode temp = l1;
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp!=null){
            st1.push(temp.val);
            temp = temp.next;
        }
        int carry = 0;
        ListNode ans = null;
        while(!st.isEmpty() && !st1.isEmpty()){
            ListNode a = new ListNode();
            int sum = (st.pop() + st1.pop() + carry);
            a.val = sum%10;
            carry = sum/10;
            a.next = ans;
            ans = a;
        }
        while(!st.isEmpty()){
            ListNode a = new ListNode();
            int sum = (st.pop() + carry);
            a.val = sum%10;
            carry = sum/10;
            a.next = ans;
            ans = a;
        }
        while(!st1.isEmpty()){
            ListNode a = new ListNode();
            int sum = (st1.pop() + carry);
            a.val = sum%10;
            carry = sum/10;
            a.next = ans;
            ans = a;
        }
        if(carry!=0){
            ListNode a = new ListNode();
            a.val = carry;
            a.next = ans;
            ans = a;
        }
        return ans;
    }
}