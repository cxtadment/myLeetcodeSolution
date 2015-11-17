/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || m >= n) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preNode = dummy;
        ListNode rearNode = head;
        for (int i = 1; i <= m - 1; i++) {
            preNode = preNode.next;
        }
        for (int i = 1; i < n + 1; i++) {
            rearNode = rearNode.next;
        }
        ListNode curr = preNode.next;
        ListNode mNode = curr;
        ListNode pre = mNode;
        for (int i = 1; i < n - m + 1; i++) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        curr.next = pre;
        mNode.next = rearNode;
        preNode.next = curr;
        return dummy.next;
        
    }
}