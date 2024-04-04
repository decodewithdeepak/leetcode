class Solution {
    public List<Integer> inorderTraversal(TreeNode root) { 
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }

    // Iterative solution Using Stack
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<>();
    //     if (root == null) return result;

    //     Stack<TreeNode> st = new Stack<>();
    //     st.push(root);
    //     while (!st.isEmpty()) {
    //         TreeNode temp = st.peek();
    //         if (temp.left != null) {
    //             st.push(temp.left);
    //             temp.left = null;
    //         } else {
    //             st.pop();
    //             result.add(temp.val);
    //             if (temp.right != null) st.push(temp.right);
    //         }
    //     }

    //     return result;
    // }
}
