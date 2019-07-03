package com.mark.linkedlist.No_142_LinkedListCircle_II;

import com.mark.linkedlist.ListNode;

public class Solution {

    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode cur = head;
                while (cur != fast) {
                    cur = cur.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }

}
