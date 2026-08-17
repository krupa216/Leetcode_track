// Last updated: 8/17/2026, 11:03:19 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode s=head;
15        ListNode f=head;
16        while(f!=null && f.next!=null)
17        {
18            s=s.next;
19            f=f.next.next;
20
21            if(s==f)
22            {
23                return true;
24            }
25        }
26        return false;
27    }
28}