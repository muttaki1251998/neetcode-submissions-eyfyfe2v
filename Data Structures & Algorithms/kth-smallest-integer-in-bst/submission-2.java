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

    private int counter = 0;
    private int result = 0;

    private void dfs(TreeNode root, int k) {
        if(root == null) return;

        dfs(root.left, k);
        counter++;

        if(counter == k) {
            result = root.val;
            return;
        }
        dfs(root.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }
}
