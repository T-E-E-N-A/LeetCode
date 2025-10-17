/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int n = qu.size();
            for(int i=0 ; i<n ; i++){
                Node x = qu.poll();
                if(i<n-1) x.next = qu.peek();
                else x.next = null;
                if(x.left!=null) qu.add(x.left);
                if(x.right!=null) qu.add(x.right);
            }
        }
        return root;
    }
}