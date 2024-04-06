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
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int lh = height(root.left);
        int rh = height(root.right);
        int d = Math.abs(lh - rh);

        if (d > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int height(TreeNode root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}