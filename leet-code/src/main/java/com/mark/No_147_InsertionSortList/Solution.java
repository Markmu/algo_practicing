package com.mark.No_147_InsertionSortList;

import com.mark.ListNode;

/**
 * Created by Mark on 2019-07-05.
 */
public class Solution {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dommy = new ListNode(0);
        dommy.next = head;
        ListNode cur = head;
        ListNode prev = dommy;

        while (cur != null) {
            ListNode prt = dommy.next;
            ListNode prtPrev = dommy;
            boolean flag = false;
            while (prt != cur) {
                if (cur.val < prt.val) {
                    flag = true;
                    break;
                }
                prtPrev = prt;
                prt = prt.next;
            }

            if (flag) {
                prev.next = cur.next;
                prtPrev.next = cur;
                cur.next = prt;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }

        return dommy.next;

    }

}
