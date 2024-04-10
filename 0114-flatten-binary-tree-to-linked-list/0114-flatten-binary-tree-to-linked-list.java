class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        TreeNode left = root.left; // left subtree
        TreeNode right = root.right; // right subtree

        flatten(left);
        flatten(right);

        root.left = null; // left is null
        root.right = left; // left is now right

        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }

        temp.right = right;
    }
}