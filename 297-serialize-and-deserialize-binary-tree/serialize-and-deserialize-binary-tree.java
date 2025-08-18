/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder st = new StringBuilder();
        if(root==null){
            st.append("end,");
            return st.toString();
        }
        st.append(root.val+",");
        st.append(serialize(root.left));
        st.append(serialize(root.right));
        return st.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return createTree(arr);
    }
    private int i=0;
    private TreeNode createTree(String[] arr){
        if(i==arr.length || arr[i].equals("end")){
            i++;
            return null;
        }
        TreeNode root = new TreeNode();
        root.val = Integer.parseInt(arr[i++]);
        root.left = createTree(arr);
        root.right = createTree(arr);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));