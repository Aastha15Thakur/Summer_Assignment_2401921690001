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

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    private void dfs(TreeNode n, StringBuilder sb) {
        if (n == null) {
            sb.append("X,");
            return;
        }
        sb.append(n.val).append(",");
        dfs(n.left, sb);
        dfs(n.right, sb);
    }

    public TreeNode deserialize(String data) {
        java.util.LinkedList<String> q = new java.util.LinkedList<>(java.util.Arrays.asList(data.split(",")));
        return build(q);
    }

    private TreeNode build(java.util.LinkedList<String> q) {
        String s = q.poll();
        if (s.equals("X")) return null;
        
        TreeNode n = new TreeNode(Integer.parseInt(s));
        n.left = build(q);
        n.right = build(q);
        return n;
    }
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));