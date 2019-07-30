package com.mark.No_2_AddTwoNumber;

import com.mark.ListNode;

/**
 * Created by Mark on 2019-04-26.
 */

public class Solution {

//    整型溢出
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int num1 = getNumberFromList(l1);
//        int num2 = getNumberFromList(l2);
//        int result = num1 + num2;
//        return getListByNumber(result);
//    }
//
//    private int getNumberFromList(ListNode list) {
//        int multiplier = 1;
//        int result = 0;
//        while (list != null) {
//            result += list.val * multiplier;
//            multiplier *= 10;
//            list = list.next;
//        }
//        return result;
//    }
//
//    private ListNode getListByNumber(int number) {
//        if (number == 0) return new ListNode(0);
//        ListNode head = null;
//        ListNode cur = null;
//        while (number != 0) {
//            ListNode node = new ListNode(number % 10);
//            number /= 10;
//            if (head == null) {
//                head = node;
//                cur = node;
//            } else {
//                cur.next = node;
//                cur = cur.next;
//            }
//        }
//        return head;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 == null) ? 0 : l1.val;
            l1 = (l1 != null) ? l1.next : null;
            int val2 = (l2 == null) ? 0 : l2.val;
            l2 = (l2 != null) ? l2.next : null;
            int digit = val1 + val2 + carry;
            carry = digit / 10;
            digit %= 10;
            cur.next = new ListNode(digit);
            cur = cur.next;
        }

        return head.next;

    }

    public static void main(String[] args) {
//        ListNode cur = new ListNode(2);
//        ListNode list1 = cur;
//        cur.next = new ListNode(4);
//        cur = cur.next;
//        cur.next = new ListNode(3);
//        cur = cur.next;
//
//        cur = new ListNode(5);
//        ListNode list2 = cur;
//        cur.next = new ListNode(6);
//        cur = cur.next;
//        cur.next = new ListNode(4);


        ListNode cur = new ListNode(9);
        ListNode list1 = cur;

        cur = new ListNode(1);
        ListNode list2 = cur;
        cur.next = new ListNode(9);
        cur = cur.next;

        cur = new Solution().addTwoNumbers(list1, list2);

        while (list2 != null) {
            System.out.print(list2.val);
            list2 = list2.next;
        }

        System.out.println();
        while (cur != null) {
            System.out.print(cur.val);
            cur = cur.next;
        }

    }
}
