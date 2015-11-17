/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        int length = getLength(head);
        
        ListNode newHead = null;
        ListNode preMarkHead = head;
        
        k = k % length;
        if (k == 0) {
            return head;
        }
        
        for (int i = 1; i < length - k; i++) {
            head = head.next;
        }
        
        newHead = head.next;
        ListNode reverseHead = head.next;
        head.next = null;
        
        while (reverseHead.next != null) {
            reverseHead = reverseHead.next;
        }
        reverseHead.next = preMarkHead;
        
        return newHead;
       
    }
    
    private int getLength(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}