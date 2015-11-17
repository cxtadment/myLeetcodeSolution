/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    // public boolean isBalanced(TreeNode root) {
    //     if (root == null) return true;
    //     return Math.abs(processor(root.left) - processor(root.right)) <= 1 
    //         && isBalanced(root.left) && isBalanced(root.right);
        
    // }
    
    // private int processor(TreeNode root) {
    //     if (root == null) return 0;
    //     return Math.max(processor(root.left), processor(root.right)) + 1;
    // }
    
    public boolean isBalanced(TreeNode root) {
        return processor(root) != -1;
    }
    
    private int processor(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = processor(root.left);
        if (leftDepth == -1) return -1;
        int rightDepth = processor(root.right);
        if (rightDepth == -1) return -1;
        return (Math.abs(leftDepth - rightDepth) <= 1) ? (Math.max(leftDepth, rightDepth) + 1) : -1;
    }
}