/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = head;
        ListNode preNode = dummy;
        while (node != null && node.next != null) {
            ListNode postNode = node.next;
            preNode.next = postNode;
            node.next = postNode.next;
            postNode.next = node;
            preNode = node;
            node = node.next;
        }
        return dummy.next;
    }
}