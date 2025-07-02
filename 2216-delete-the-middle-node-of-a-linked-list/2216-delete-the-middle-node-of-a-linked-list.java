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
    public ListNode deleteMiddle(ListNode head) {
        ListNode tptr = head;
        if(head == null || head.next==null) return null;
        int c = 0;
        while(tptr!=null){
            c++;
            tptr=tptr.next;
        }
        tptr=head;
        int n = c/2;
        for(int i =0;i<n-1;i++)
        {
            tptr=tptr.next;
        }
        tptr.next = tptr.next.next;
        return head;
    }
}