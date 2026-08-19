class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p = dummy;

        while (p.next != null && p.next.next != null) {
            ListNode a = p.next;
            ListNode b = a.next;

            a.next = b.next;
            b.next = a;
            p.next = b;

            p = a;
        }

        return dummy.next;
    }
}