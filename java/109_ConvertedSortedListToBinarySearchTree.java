/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    private ListNode list;
    public TreeNode sortedListToBST(ListNode head) {
        list = head;
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return sortedListToBST(0, count - 1);
    }
    
    private TreeNode sortedListToBST(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode leftChild = sortedListToBST(start, mid - 1);
        TreeNode p = new TreeNode(list.val);
        p.left = leftChild;
        list = list.next;
        p.right = sortedListToBST(mid + 1, end);
        return p;
    }
}