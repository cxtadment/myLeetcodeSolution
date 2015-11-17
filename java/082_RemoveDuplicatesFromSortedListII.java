/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode node  = dummy;
        node.next = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                while (head != null && head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head = head.next;
                if (head == null) {
                    node.next = head;
                    node = node.next;
                } else if (head.next == null) {
                    node.next = head;
                    node = node.next;
                }
                
            } else {
                node.next = head;
                node = node.next;
                head = head.next;
            }
        }
        return dummy.next;
    }
}