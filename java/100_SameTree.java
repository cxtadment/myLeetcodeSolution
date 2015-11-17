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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        //check left tree;
        TreeNode leftP = p.left;
        TreeNode leftQ = q.left;
        //check right tree;
        TreeNode rightP = p.right;
        TreeNode rightQ = q.right;
        
        return isSameTree(leftP, leftQ) && isSameTree(rightP, rightQ);
    }
}