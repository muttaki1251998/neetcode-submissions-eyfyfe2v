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
    private TreeNode minimumValueNode(TreeNode node) {
        TreeNode current = node;
        while(current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        // Traverse to find the node to be removed
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            // We found the node to remove
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            else{
                TreeNode minimumNode = minimumValueNode(root.right);
                root.val = minimumNode.val;
                root.right = deleteNode(root.right, minimumNode.val);
            }
        }
        return root;
    }
}