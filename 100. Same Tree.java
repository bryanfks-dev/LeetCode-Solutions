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
    boolean is_simetric = true;

    public void preorder(TreeNode p, TreeNode q) {
        // Function to perform preorder tranversal
        // Check if p and q are not null
        if (p != null && q != null) {
            if (p.val != q.val)
                is_simetric = is_simetric && false;
            
            preorder(p.left, q.left);
            preorder(p.right, q.right);
        }
        // If one of p or q is null
        else if ((p == null && q != null) || (p != null && q == null))
            is_simetric = is_simetric && false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        preorder(p, q);

        return is_simetric;
    }
}