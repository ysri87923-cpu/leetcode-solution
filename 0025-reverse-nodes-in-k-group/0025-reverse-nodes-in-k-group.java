class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;

        while (cur != null && count < k) {
            cur = cur.next;
            count++;
        }

        if (count < k) return head;

        ListNode prev = null;
        cur = head;

        for (int i = 0; i < k; i++) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        head.next = reverseKGroup(cur, k);
        return prev;
    }
}