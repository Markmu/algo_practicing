package com.mark.No_237_DeleteNodeInLinkedList;

import com.mark.ListNode;

public class Solution {


    /**
     * 将后一个node的value复制到当前node然后删除后一个node
     * 真是个逗逼的题目
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
