/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseBetween(struct ListNode* head, int left, int right)
{
    if (left == right || head == NULL)
    {
        return head;
    }
    
    int numReverse = right - left + 1;
    int arr[numReverse];
    int count = 1;
    struct ListNode * temp = head; 
    
    while (count < left)
    {
        temp = temp -> next;
        count++;
    }
    
    for (int i = 0; i < numReverse; i++)
    {
        arr[i] = temp -> val;
        temp = temp -> next;
    }
    
    temp = head;
    count = 1;
    
    while (count < left)
    {
        count++;
        temp = temp -> next;
    }
    
    for (int i = numReverse - 1; i >= 0; i--)
    {
        temp -> val = arr[i];
        temp = temp -> next;
    }
    
    return head;
    
    
}    

