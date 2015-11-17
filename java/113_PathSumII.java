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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> subResult = new ArrayList<Integer>();
        subResult.add(root.val);
        pathSumHelper(result, subResult, root, sum - root.val);
        return result;
    }
    
    public void pathSumHelper(List<List<Integer>> result, List<Integer> subResult, TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            if (sum == 0) {
                result.add(new ArrayList<Integer>(subResult));
            } 
        }
        if (root.left != null) {
            subResult.add(root.left.val);
            pathSumHelper(result, subResult, root.left, sum - root.left.val);
            subResult.remove(subResult.size() - 1);
        }
        if (root.right != null) {
            subResult.add(root.right.val);
            pathSumHelper(result, subResult, root.right, sum - root.right.val);
            subResult.remove(subResult.size() - 1);
        }
    }
}