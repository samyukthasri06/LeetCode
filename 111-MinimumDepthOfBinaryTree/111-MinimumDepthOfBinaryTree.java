// Last updated: 7/17/2026, 3:16:16 PM
class Solution {
    public int minDepth(TreeNode root) {
        
        // If tree is empty
        if (root == null) {
            return 0;
        }

        // If left child is null, go only to the right subtree
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right child is null, go only to the left subtree
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // If both children exist, take the minimum depth
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}