// Last updated: 7/17/2026, 3:16:23 PM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // One node is null or values are different
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        // Check left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}