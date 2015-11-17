/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        TreeLinkNode parent = root;
        TreeLinkNode nextLevelStartNode = parent.left;
        while (parent != null && nextLevelStartNode != null) {
            TreeLinkNode preNode = parent.left;
            boolean flag = true;
            while (parent != null) {
                if (flag) {
                    preNode.next = parent.right;
                    preNode = preNode.next;
                    flag = !flag;
                } else if (parent.next != null){
                    parent = parent.next;
                    preNode.next = parent.left;
                    preNode = preNode.next;
                    flag = !flag;
                } else {
                    break;
                }
            }
            parent = nextLevelStartNode;
            nextLevelStartNode = parent.left;
        }
    }
}