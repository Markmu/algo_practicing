package com.mark.linkedlist.No_61_RotateList;

import com.mark.linkedlist.ListNode;

import java.util.LinkedList;

public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) return head;
        int len = 0;
        ListNode cur = head;  //计算长度
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        k = k % len;        // 求出实际末尾的几个节点移动到链表前方
        if (k == 0) {
            return head;
        }
        int r = len - k;    // 从旧的头结点到新的头结点的距离
        ListNode resultHead = null;
        ListNode prev = null;
        cur = head;
        while(r-- != 0) {    // 移动至新头结点
            prev = cur;
            cur = cur.next;
        }
        resultHead = cur;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;
        prev.next = null;
        return resultHead;
    }


//    超时
//    public ListNode rotateRight(ListNode head, int k) {
//        if (head == null || head.next == null) return head;
//        ListNode cur = head;
//        LinkedList<ListNode> queue = new LinkedList<>();
//        while (cur != null) {
//            queue.offer(cur);
//            cur = cur.next;
//        }
//        while (k-- != 0) {
//            queue.offerFirst(queue.pollLast());
//        }
//        head = null;
//        cur = null;
//        while (!queue.isEmpty()) {
//            if (head == null) {
//                head = queue.pollFirst();
//                cur = head;
//            } else {
//                cur.next = queue.pollFirst();
//                cur = cur.next;
//            }
//        }
//        cur.next = null;
//        return head;
//    }
//    public ListNode rotateRight(ListNode head, int k) {
//        while (k-- != 0) {
//            head = moveLastToFirst(head);
//        }
//        return head;
//    }
//
//    private ListNode moveLastToFirst(ListNode head) {
//        if (head == null) return head;
//        ListNode last = null;
//        ListNode cur = head;
//
//        while (cur.next != null) {
//            last = cur;
//            cur = cur.next;
//        }
//        if (last != null) {
//            last.next = null;
//            cur.next = head;
//        }
//        return cur;
//    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i < 6; i++) {
            cur.next= new ListNode(i);
            cur = cur.next;
        }

        head = new Solution().rotateRight(head, 1);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}