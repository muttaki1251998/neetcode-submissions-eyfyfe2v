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
    private void inOrder(TreeNode root, List<Integer>treeValues){
        if(root == null) {
            return;
        }
        inOrder(root.left, treeValues);
        treeValues.add(root.val);
        inOrder(root.right, treeValues);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> treeValues = new ArrayList<>();
        inOrder(root, treeValues);
        return treeValues;
    }
}