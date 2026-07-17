// Last updated: 7/17/2026, 3:16:20 PM
class Solution {
    public int maxDepth(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Find depth of left subtree
        int leftDepth = maxDepth(root.left);

        // Find depth of right subtree
        int rightDepth = maxDepth(root.right);

        // Return maximum depth + current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}