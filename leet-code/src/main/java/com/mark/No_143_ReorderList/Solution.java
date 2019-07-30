package com.mark.No_143_ReorderList;

import com.mark.ListNode;

public class Solution {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        prev = null;
        ListNode next = null;
        while (slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode cur = new ListNode(0);
        int i = 0;

        while (head != null) {
            if (i % 2 == 0) {
                cur.next = head;
                head = head.next;
            } else {
                cur.next = prev;
                prev = prev.next;
            }
            cur = cur.next;
            i++;
        }
        cur.next = prev;
    }

}
