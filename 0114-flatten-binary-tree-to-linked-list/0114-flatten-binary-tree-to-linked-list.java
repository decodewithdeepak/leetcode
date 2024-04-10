class Solution {
    public void flatten(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode pre = current.left;
                while (pre.right != null) {
                    pre = pre.right;
                }

                pre.right = current.right;
                current.right = current.left;
                current.left = null;
            }

            current = current.right;
        }
    }
}