package com.mark.No_86_PartitionList;

import com.mark.ListNode;

/**
 * Created by Mark on 2019-05-15.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode curBefore = dummy;
        ListNode curAfter = head;
        ListNode prev = newHead;

        while (curAfter != null) {
            if (curAfter.val < x) {
                curBefore.next = curAfter;
                curBefore = curBefore.next;

                prev.next = curAfter.next;
            } else {
                prev = prev.next;
            }

            curAfter = curAfter.next;
        }

        curBefore.next = newHead.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int[] arr = new int[]{1,4,3,2,5,2};
        for (int i = 0; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        cur = head.next;

        head = new Solution().partition(cur, 2);

        while (head != null) {
            System.out.print(head.val +" ");
            head = head.next;
        }


    }
}
