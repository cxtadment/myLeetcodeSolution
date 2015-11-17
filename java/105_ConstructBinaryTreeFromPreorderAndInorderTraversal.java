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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length) {
            return null;
        }
        TreeNode result = buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return result;
    }
    
    public TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int position = getPosition(inorder, inStart, inEnd, preorder[preStart]);
        root.left = buildTreeHelper(preorder, preStart + 1, preStart + position - inStart, inorder, inStart, position - 1);
        root.right = buildTreeHelper(preorder, preEnd - (inEnd - position) + 1, preEnd, inorder, position + 1, inEnd);
        
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