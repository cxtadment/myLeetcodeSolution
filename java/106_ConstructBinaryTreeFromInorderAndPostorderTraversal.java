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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length) {
            return null;
        }
        TreeNode result = buildTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        return result;
    }
    
    public TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int position = getPosition(inorder, inStart, inEnd, postorder[postEnd]);
        root.left = buildTreeHelper(inorder, inStart, position - 1, postorder, postStart, postStart + position - inStart - 1);
        root.right = buildTreeHelper(inorder, position + 1, inEnd, postorder, postEnd - (inEnd - position), postEnd - 1);
        return root;
    }
    
    public int getPosition(int[] inorder, int inStart, int inEnd, int key) {
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == key) {
                return i;
            }
        }
        return -1;
    }
}