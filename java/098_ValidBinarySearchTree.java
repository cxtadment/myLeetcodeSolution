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
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        //use long to avoid equal min or max cases
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBSTHelper(TreeNode root, long low, long high) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= high) {
            return false;
        }
        return isValidBSTHelper(root.left, low, root.val) && isValidBSTHelper(root.right, root.val, high);
    }
}