package com.mark.linkedlist.No_138_CopyListWithRandomPointer;


import java.util.HashMap;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}

public class Solution {

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> oldListMap = new HashMap<>();

        Node cur = head;

        while (cur != null) {
            Node node = new Node();
            node.val = cur.val;
            oldListMap.put(cur, node);
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            oldListMap.get(cur).next = oldListMap.get(cur.next);
            oldListMap.get(cur).random = oldListMap.get(cur.random);
            cur = cur.next;
        }

        return oldListMap.get(head);

    }


}
