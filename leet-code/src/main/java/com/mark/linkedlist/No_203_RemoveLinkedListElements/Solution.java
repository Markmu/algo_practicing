package com.mark.linkedlist.No_203_RemoveLinkedListElements;

import com.mark.linkedlist.ListNode;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {

            if (cur.val == val && prev == null) {
                cur = cur.next;
                head = cur;
                continue;
            }
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

}
