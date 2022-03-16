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
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int countNodes = 0;
        if (head.next == null)
        {
            head = null;
            return head;
        }
        
        if (head.next.next == null)
        {
            if (n == 2)
            {
                head = head.next;
                return head;
            }
            
            if (n == 1)
            {
                ListNode temp = head;
                ListNode prev = null;
                ListNode next = null;
                
                while (temp != null)
                {
                   next = temp.next;
                   temp.next = prev;
                   prev = temp;
                   temp = next;
                }
                
                temp = prev;
                temp = temp.next;
                
                return temp;
            }
                
        }
        
        
        ListNode temp = head;
        ListNode revNode = head;
        ListNode prev = null;
        ListNode next = null;
        
        while (temp != null)
        {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            countNodes++;
        }
        
        
        revNode = prev;
        int count = 1; 
        
        if (n == 1)
        {
            revNode = revNode.next;
            
            ListNode back = revNode;
            prev = null;
            next = null;
        
            while (back != null)
            {
                next = back.next;
                back.next = prev;
                prev = back;
                back = next;
            }
            
            head = prev;
            
            return head;
        }
        
        if (n == countNodes)
        {         
            ListNode back = revNode;
            prev = null;
            next = null;
        
            while (back.next != null)
            {
                next = back.next;
                back.next = prev;
                prev = back;
                back = next;
            }
            
            head = prev;
            
            return head;
        } 
        
        ListNode temp1 = revNode;
        
        while (count != n - 1)
        {
            revNode = revNode.next;
            count++;
        } 
        
        revNode.next = revNode.next.next;
        
        ListNode back = temp1;
        prev = null;
        next = null;
        
        while (back != null)
        {
            next = back.next;
            back.next = prev;
            prev = back;
            back = next;
        }
        
        head = prev;
        
        return head;   
    }
}