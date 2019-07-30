package com.mark.No_141_LinkedListCircle;

import com.mark.ListNode;

public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 0; i < 5; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        cur.next = head.next.next;

        System.out.println(new Solution().hasCycle(head));
    }

}
