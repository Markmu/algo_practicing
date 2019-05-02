package com.mark.linkedlist.No_82_RemoveDuplicatesFromSortedList_II;

import com.mark.linkedlist.ListNode;

import java.util.HashMap;

/**
 * Created by Mark on 2019-05-02.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode cur = head;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (cur != null) {
            if (map.containsKey(cur.val)) {
                map.put(cur.val, map.get(cur.val) + 1);
            } else {
                map.put(cur.val, 1);
            }
            cur = cur.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode newCur = dummy;
        cur = head;
        while (cur != null) {
            if (map.get(cur.val) == 1) {
                newCur.next = new ListNode(cur.val);
                newCur = newCur.next;
            }
            cur = cur.next;
        }
        newCur.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < 7; i++) {
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
