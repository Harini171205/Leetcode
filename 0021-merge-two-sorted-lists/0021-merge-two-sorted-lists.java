class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode();  
        ListNode tptr = start;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tptr.next = list1;
                list1 = list1.next;
            } else {
                tptr.next = list2;
                list2 = list2.next;
            }
            tptr = tptr.next;
        }

        if (list1 != null) {
            tptr.next = list1;
        } else {
            tptr.next = list2;
        }

        return start.next;
    }
}
