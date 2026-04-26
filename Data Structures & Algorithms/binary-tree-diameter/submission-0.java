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
    int max = 0;

    private int height(TreeNode root) {
        if (root == null) return 0;

        int leftH = height(root.left);
        int rightH = height(root.right);

        // update diameter;
        max = Math.max(max, leftH + rightH);

        return 1 + Math.max(rightH, leftH);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }
}
