package com.mark.No_109_ConvertSortedListToBST;

import com.mark.ListNode;
import com.mark.TreeNode;

public class Solution {

    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (pre != null) {
            pre.next = null;
        }

        return slow;
    }

    public TreeNode sortedListToBST(ListNode head) {

        if (head == null) return null;

        ListNode middle = this.findMiddle(head);

        TreeNode root = new TreeNode(middle.val);

        if (middle == head) {
            return root;
        }

        root.left = sortedListToBST(head);
        root.right = sortedListToBST(middle.next);

        return root;
    }
}
