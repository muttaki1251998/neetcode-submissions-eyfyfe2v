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
    private TreeNode insertRecord(TreeNode node, int value) {
        if(node == null) {
            return new TreeNode(value);
        }
        if(value < node.val){
            node.left = insertRecord(node.left, value);
        }
        if(value > node.val){
            node.right = insertRecord(node.right, value);
        }
        return node;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insertRecord(root, val);
        return root;
    }
}