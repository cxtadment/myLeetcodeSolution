/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode list = dummy;
        int flag = 0;
        while (l1 != null || l2 != null) {
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            if (num1 + num2 + flag > 9) {
                ListNode tempNode = new ListNode(num1 + num2 + flag - 10);
                list.next = tempNode;
                list = list.next;
                flag = 1;
            } else {
                ListNode tempNode = new ListNode(num1 + num2 + flag);
                list.next = tempNode;
                list = list.next;
                flag = 0;
            }
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if (flag == 1) {
            list.next = new ListNode(1);
        }
        return dummy.next;
    }
}