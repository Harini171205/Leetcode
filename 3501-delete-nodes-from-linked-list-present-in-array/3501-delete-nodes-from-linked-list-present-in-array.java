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

        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        while (head != null && set.contains(head.val)) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode tptr = head;
        while (tptr != null && tptr.next != null) {
            if (set.contains(tptr.next.val)) {
                tptr.next = tptr.next.next;
            } else {
                tptr = tptr.next;
            }
        }

        return head;
    }
}
