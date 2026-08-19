class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        ListNode r = lists[0];

        for (int i = 1; i < lists.length; i++)
            r = merge(r, lists[i]);

        return r;
    }

    ListNode merge(ListNode a, ListNode b) {
        ListNode d = new ListNode(0), t = d;

        while (a != null && b != null) {
            if (a.val < b.val) {
                t.next = a;
                a = a.next;
            } else {
                t.next = b;
                b = b.next;
            }
            t = t.next;
        }

        t.next = a != null ? a : b;
        return d.next;
    }
}