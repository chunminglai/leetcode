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
        
        ListNode p = new ListNode(0);
        p.next=head;
        ListNode first = p;
        ListNode second = p;
        for(int i=0;i<n;i++){
            first = first.next;
        }
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return p.next;
    }
    
}
