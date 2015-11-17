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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int end = nums.length - 1;
        int start = 0;
        return processor(nums, start, end);
    }
    
    private TreeNode processor(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode p = new TreeNode(nums[mid]);
        p.left = processor(nums, start, mid - 1);
        p.right = processor(nums, mid + 1, end);
        return p;
    }
}