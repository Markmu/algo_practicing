package com.mark.No_206_ReverseList;

import com.mark.ListNode;

/**
 * Created by Mark on 2019-05-15.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int[] arr = new int[]{1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        cur = head.next;

        head = new Solution().reverseList(cur);

        while (head != null) {
            System.out.print(head.val +" ");
            head = head.next;
        }
    }
}
