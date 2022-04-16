/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode num = new ListNode(0);
        ListNode k = l1;
        ListNode m = l2;
        ListNode curr = num;
        
        int start = 0;
        
         while (k != null || m != null) 
         {
            int x = (k != null) ? k.val : 0;
            int y = (m != null) ? m.val : 0;
            int sum = start + x + y;
            start = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (k != null) 
            {
                k = k.next;
            }
             
            if (m != null) 
            {
                m = m.next;
            }
         }
        
    if (start > 0) 
    {
        curr.next = new ListNode(start);
    }
        
    return num.next;
    }
}