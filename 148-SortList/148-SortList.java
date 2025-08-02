// Last updated: 8/2/2025, 11:55:34 PM
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode a = sortList(head);
        ListNode b = sortList(mid);
        return mergeLists(a,b);
    }
    public ListNode mergeLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode head = temp;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                temp.next=list2;
                list2 = list2.next;
            }else{
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        if(list1!=null){
            temp.next = list1;
        }
        if(list2!=null){
            temp.next = list2;
        }
        return head.next;
    }
}