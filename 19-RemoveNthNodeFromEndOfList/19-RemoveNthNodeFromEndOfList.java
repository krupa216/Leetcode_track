// Last updated: 7/14/2026, 2:04:34 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr=new ListNode(0);
        curr.next=head;
        ListNode s=curr;
         ListNode f=curr;

        for(int i=0;i<=n;i++)
        {
            f=f.next;
        }
        while(f!=null)
        {
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return curr.next;
        
    }
}