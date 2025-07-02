class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tptr = head;
        if(head==null || head.next==null) return head;
        while(tptr.next!=null){
            if(tptr.val == tptr.next.val){
                tptr.next=tptr.next.next;
            }
            else{
                tptr = tptr.next;
            }
        }
        return head;
    }
}