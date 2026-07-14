// Last updated: 7/14/2026, 2:04:03 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t1=head;
         while (t1 != null && t1.next != null) {
          
            
            if (t1.val == t1.next.val) {
                ListNode temp = t1.next.next;
                t1.next = temp;
            }
            else {
                t1 = t1.next;
            }
        }
        return head;

    }
}