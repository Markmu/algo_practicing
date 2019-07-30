package com.mark.No_92_ReverseLinkedList_II;

import com.mark.ListNode;

public class Solution {

    private ListNode left;
    private boolean stop = false;

    public ListNode reverseBetween(ListNode head, int m, int n) {
//        this.left = head;
//        this.recurseAndReverse(left, m, n);
//        return head;

        // Approach 2
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;

        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        ListNode con = prev;
        ListNode tail = cur;

        ListNode helper = null;
        while (n > 0) {
            helper = cur.next;
            cur.next = prev;
            prev = cur;
            cur = helper;

            n--;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;

        return head;
    }

    private void recurseAndReverse(ListNode right, int m, int n) {
        if (n == 1) {
            return ;
        }

        right = right.next;

        if (m > 1) {
            this.left = this.left.next;
        }

        this.recurseAndReverse(right, m - 1, n - 1);

        if (this.left == right || right.next == this.left) {
            this.stop = true;
        }

        if (!this.stop) {
            int tmp = this.left.val;
            this.left.val = right.val;
            right.val = tmp;

            this.left = this.left.next;
        }

    }

    public static void main (String[] args) {

        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < 10; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            System.out.print(" " + cur.val);
            cur = cur.next;
        }

        head = new Solution().reverseBetween(head, 1, 4);
        System.out.println();
        cur = head;
        while (cur != null) {
            System.out.print(" " + cur.val);
            cur = cur.next;
        }

    }
}
