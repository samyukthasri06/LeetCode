// Last updated: 7/17/2026, 3:16:02 PM
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    public void preorder(TreeNode node, List<Integer> result) {

        if (node == null) {
            return;
        }

        result.add(node.val);          // Root
        preorder(node.left, result);   // Left
        preorder(node.right, result);  // Right
    }
}