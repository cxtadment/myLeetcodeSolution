/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        
        ListNode firstDummy = new ListNode(0);
        ListNode secondDummy = new ListNode(0);
        ListNode firstNode = firstDummy;
        ListNode secondNode = secondDummy;
        
        while (head != null) {
            if (head.val < x) {
                firstNode.next = head;
                firstNode = firstNode.next;
            } else {
                secondNode.next = head;
                secondNode = secondNode.next;
            }
            head = head.next;
        }
        
        secondNode.next = null;
        firstNode.next = secondDummy.next;
        return firstDummy.next;
        
    }
}