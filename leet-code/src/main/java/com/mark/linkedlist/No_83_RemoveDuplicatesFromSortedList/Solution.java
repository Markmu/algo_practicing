package com.mark.linkedlist.No_83_RemoveDuplicatesFromSortedList;

import com.mark.linkedlist.ListNode;


/**
 * Created by Mark on 2019-05-02.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode cur = head;
        ListNode prev = head;

        while (cur != null) {
            if (cur.val != prev.val) {
                prev.next = cur;
                prev = prev.next;
            }
            cur = cur.next;
        }
        prev.next = null;
        return head;
    }
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        ListNode newHead = new ListNode(head.val);
//        ListNode cur = head;
//        ListNode newCur = newHead;
//
//        while (cur != null) {
//            if (newCur.val != cur.val) {
//                newCur.next = new ListNode(cur.val);
//                newCur = newCur.next;
//            }
//            cur = cur.next;
//        }
//
//        return newHead;
//    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i<5; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }

        head = new Solution().deleteDuplicates(head);

        System.out.println();

        cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
}
