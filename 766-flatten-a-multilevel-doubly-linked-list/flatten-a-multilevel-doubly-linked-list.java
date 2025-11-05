/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> qu = new Stack<>();
        Node temp = head;
        while(temp!=null){
            if(temp.child!=null && temp.next!=null){
                qu.push(temp.next);
                temp.next = temp.child;
                temp.next.prev = temp;
                temp.child = null;
            }else if(temp.child!=null){
                temp.next = temp.child;
                temp.next.prev = temp;
                temp.child = null;
            }
            if(temp.next==null && !qu.isEmpty()){
                temp.next = qu.pop();
                temp.next.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}