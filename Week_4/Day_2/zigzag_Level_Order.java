/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        boolean LeftToRight = true;

        while (!nodes.isEmpty()) {
            int levelSize = nodes.size();
            List<Integer> vals = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = nodes.poll();
                vals.add(node.val);

                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }

            if (!LeftToRight) {
                Collections.reverse(vals);
            }
            
            result.add(vals);
            LeftToRight = !LeftToRight;
        }
        return result;
    }
}