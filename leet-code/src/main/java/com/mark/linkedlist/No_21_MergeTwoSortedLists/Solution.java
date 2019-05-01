package com.mark.linkedlist.No_21_MergeTwoSortedLists;

import com.mark.linkedlist.ListNode;

/**
 * Created by Mark on 2019-04-28.
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = new ListNode(0);
        ListNode cur = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 != null) ? l1 : l2;
        return head.next;
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(0);
        ListNode cur = list1;
        for (int i = 3; i < 7; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        ListNode list2 = new ListNode(2);
        cur = list2;
        for (int i = 5; i < 7; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }

        cur = new Solution().mergeTwoLists(list1, list2);

        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
}
