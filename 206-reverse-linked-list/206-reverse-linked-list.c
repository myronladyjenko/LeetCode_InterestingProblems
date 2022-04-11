/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* head)
{
    struct ListNode * prev = NULL;
    struct ListNode * temp = head;
    struct ListNode * next = head;
    
    while (temp != NULL)
    {
        next = temp -> next;
        temp -> next = prev;
        prev = temp;
        temp = next;
    }
    
    head = prev;
    
    return head;
}