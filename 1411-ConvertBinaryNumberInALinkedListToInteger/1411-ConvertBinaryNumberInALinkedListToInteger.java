// Last updated: 7/14/2026, 2:02:21 PM
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
    public int getDecimalValue(ListNode head)
    {
        
        String s="";
        ListNode temp=head;
        while(temp!=null)
        {
            s=s+temp.val;
            temp=temp.next;
        }
        int n=Integer.parseInt(s,2);
         
        
        return n;
    }
   
   
}