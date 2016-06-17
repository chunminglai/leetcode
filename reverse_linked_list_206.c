/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if (head == NULL) 
        return NULL;
    struct ListNode *curr, *prev, *next;
    curr = head;
    prev = NULL;
    next = NULL;
    while(curr->next){
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    curr->next = prev;
    return curr;
}
