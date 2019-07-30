package com.mark.No_24_SwapNodesInPairs;

import com.mark.ListNode;

/**
 * Created by Mark on 2019-04-28.
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode c1 = null;
        ListNode c2 = null;
        ListNode last = new ListNode(0);
        last.next = head;
        head = last;

        while (cur != null && cur.next != null) {
            c1 = cur;
            cur = cur.next;
            c2 = cur;
            cur = cur.next;

            c1.next = c2.next;
            c2.next = c1;
            last.next = c2;
            last = c1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < 4; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }

        head = new Solution().swapPairs(head.next);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
