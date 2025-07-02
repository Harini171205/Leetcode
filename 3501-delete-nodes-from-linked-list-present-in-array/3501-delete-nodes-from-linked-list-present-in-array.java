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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (head == null || nums.length == 0) return head;

        int max = -1;
        for (int n : nums) {
            if (n > max) max = n;
        }

        boolean[] arr = new boolean[max + 1];
        for (int n : nums) {
            arr[n] = true;
        }

        while (head != null && head.val <= max && arr[head.val]) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode tptr = head;
        while (tptr != null && tptr.next != null) {
            if (tptr.next.val <= max && arr[tptr.next.val]) {
                tptr.next = tptr.next.next;
            } else {
                tptr = tptr.next;
            }
        }

        return head;
    }
}