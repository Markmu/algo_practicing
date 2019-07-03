package com.mark.linkedlist.No_160_IntersectionOfTwoLinkedLists;

import com.mark.linkedlist.ListNode;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        int lenA = 0;
        ListNode curA = headA;
        while (curA != null) {
            lenA++;
            curA = curA.next;
        }
        int lenB = 0;
        ListNode curB = headB;
        while (curB != null) {
            lenB++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;
        int difference = 0;
        if (lenA > lenB) {
            difference = lenA - lenB;
            while (difference-- > 0) {
                curA = curA.next;
            }
        } else {
            difference = lenB - lenA;
            while (difference-- > 0) {
                curB = curB.next;
            }
        }

        while (curA != null && curB != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;

        }
        return null;
    }
}
