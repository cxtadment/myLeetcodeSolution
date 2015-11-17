/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (n-- > 0) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        //this step is very important
        fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}