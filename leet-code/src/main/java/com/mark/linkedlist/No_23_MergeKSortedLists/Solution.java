package com.mark.linkedlist.No_23_MergeKSortedLists;

import com.mark.linkedlist.ListNode;

/**
 * Created by Mark on 2019-07-12.
 */
public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode result = null;
        for (ListNode list : lists) {
            result = mergeTwo(result, list);
        }
        return result;
    }

    private ListNode mergeTwo(ListNode l1, ListNode l2) {
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

}
