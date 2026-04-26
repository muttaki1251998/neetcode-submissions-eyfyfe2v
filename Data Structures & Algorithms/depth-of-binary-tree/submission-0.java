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
        if(root == null) return 0;

        int leftH = dfs(root.left);

        int rightH = dfs(root.right);

        return 1 + Math.max(leftH, rightH);
    }
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
}
