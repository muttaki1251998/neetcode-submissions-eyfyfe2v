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
    private int dfs(TreeNode root) {
        if(root == null) return 1;

        int leftH = dfs(root.left);
        if(leftH == -1) return -1;

        int rightH = dfs(root.right);
        if(rightH == -1) return -1;
        // Return -1 if heightn is inbalanced
        if(Math.abs(leftH - rightH) > 1) {
            return -1;
        }

        return 1 + Math.max(rightH, leftH);
    }
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }
}
