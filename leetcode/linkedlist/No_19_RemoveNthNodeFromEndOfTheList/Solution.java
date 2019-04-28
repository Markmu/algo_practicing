package com.mark.leetcode.linkedlist.No_19_RemoveNthNodeFromEndOfTheList;

/**
 * Created by Mark on 2019-04-28.
 */

import com.mark.leetcode.linkedlist.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) return head;

        ListNode last = head;
        ListNode cur = head;
        ListNode fast = head;
        while(n-- > 0) {
            fast = fast.next;
        }
        while(fast != null) {
            last = cur;
            cur = cur.next;
            fast = fast.next;
        }
        if (last == cur) {
            head = head.next;
            last.next = null;
        } else {
            last.next = cur.next;
            cur = null;
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i <= 5; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }

        head = new Solution().removeNthFromEnd(head, 1);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

}