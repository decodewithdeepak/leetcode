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
    public int amountOfTime(TreeNode root, int start) {
        TreeNode node = getNode(root, start);
        Map<TreeNode, TreeNode> p = new HashMap<>(); // parent map => key: child, value: parent
        preorder(root, p);

        // BFS
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        Map <TreeNode, Integer> v = new HashMap<>(); // visited map => key: node, value: level
        v.put(node, 0);
        while (!q.isEmpty()) {
            TreeNode temp = q.peek();
            int level = v.get(temp);
            if(temp.left != null && !v.containsKey(temp.left)) {
                q.add(temp.left);
                v.put(temp.left, level + 1);
            }
            if(temp.right != null && !v.containsKey(temp.right)) {
                q.add(temp.right);
                v.put(temp.right, level + 1);
            }
            if(p.containsKey(temp) && !v.containsKey(p.get(temp))) {
                q.add(p.get(temp));
                v.put(p.get(temp), level + 1);
            }
            q.remove();
        }

        int max = 0;
        for (int level : v.values()) {
            max = Math.max(max, level);
        }

        return max;

    }

    private TreeNode getNode(TreeNode root, int start) {
        if (root == null) return null;
        if (root.val == start) return root;

        TreeNode left = getNode(root.left, start);
        TreeNode right = getNode(root.right, start);

        return left != null ? left : right; // if left is not null return left else return right
    }

    private void preorder(TreeNode root, Map<TreeNode, TreeNode> p) {
        if (root == null) return;

        if (root.left != null) p.put(root.left, root);
        if (root.right != null) p.put(root.right, root);

        preorder(root.left, p);
        preorder(root.right, p);
    }
}