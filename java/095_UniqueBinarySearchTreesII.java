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
    public List<TreeNode> generateTrees(int n) {
        return generateTreesHelper(1, n);
    }
    
    public List<TreeNode> generateTreesHelper(int start, int end) {
        List<TreeNode> result = new ArrayList<TreeNode>();
        if (start > end) {
            //pay attention to this step
            result.add(null);
            return result;
        }
        
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTree = generateTreesHelper(start, i - 1);
            List<TreeNode> rightTree = generateTreesHelper(i + 1, end);
            for (TreeNode lnode : leftTree) {
                for (TreeNode rnode : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    result.add(root);
                }
            }
        }
        
        return result;
    }
}