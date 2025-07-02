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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tptr1 = list1;
        for(int i =0;i<a-1;i++){
            tptr1=tptr1.next;
        }     
        ListNode tptr2 = list1;
        for(int i =0;i<b+1;i++)
        tptr2=tptr2.next;

        tptr1.next = list2;
        while(list2.next!=null)
        list2=list2.next;

        list2.next = tptr2;
        return list1;
    }
}