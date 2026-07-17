// Last updated: 7/17/2026, 3:16:21 PM
class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {

        // Both nodes are null
        if (left == null && right == null) {
            return true;
        }

        // One node is null or values differ
        if (left == null || right == null || left.val != right.val) {
            return false;
        }

        // Check mirror condition
        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
}