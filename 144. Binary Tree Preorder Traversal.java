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
    List<Integer> list = new ArrayList<>();

    private void preorder(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        // Base case
        if (root == null)
            return list;
        
        preorder(root);

        return list;

    }
}