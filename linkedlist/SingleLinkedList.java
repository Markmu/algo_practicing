/**
 *  The find, insert, delete operation of single linked list.
 *  The data of every node of the list is Integer.
 *  
 */

public class SingleLinkedList {
    
    private Node head = null;

    public Node findByValue(int value) {
        Node p = head;
        while (p != null && p.data != value)
            p = p.next;
        return p;
    }

    public Node findByIndex(int index) {
        int position = 0;
        Node p = head;

        while(p != null && position != index) 
            p = p.next;
        
        return p;
    }

    public void insertToHead(Node newNode) {
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertToHead(int value) {
        Node newNode = new Node(value, null);
        insertNode(newNode);
    }

    public void insertAfter(Node target, Node newNode) {
        if (target == null) // or target == head  if
            return;
        newNode.next = target.next;
        target.next = newNode;
    }

    public void insertAfter(Node target, int value) {
        Node node = new Node(value, target);
        insertAfter(target, node);
    }

    public void insertBefore(Node target, Node newNode) {
        if (target == null)
            return;
        if (head == target)
            insertToHead(target);

        Node p = head;
        while(p != null && p.next != target)
            p = p.next;

        if (p == null)
            return;
        p.next = newNode;
        newNode.next = target;
    }

    public void insertBefore(Node target, int value) {
        Node newNode = new Node(value, null);
        insertBefor(target, newNode);
    }

    public void deleteByNode(Node target) {
        if (target == null) return;
        if (target == head) {
            head = head.next;
            return;
        }

        Node prev = head;
        while(prev != null && prev.next != target)
            prev = prev.next;
        
        if (prev = null) return;
        prev.next = prev.next.next;
    }

    // public void deleteByValue(int value) {
    //     if (head == null) return;
    //     if (head.data == value) {
    //         head = head.next;
    //         return;
    //     }

    //     Node prev = head;

    // when prev.next equals to null, will be raising null pointer exception.
    //     while(prev != null && prev.next.data != value)
    //         prev = prev.next;
        
    //     if (prev == null) return;
    //     prev.next = prev.next.next;
    // }
    
    public void deleteByValue(int value) {
        if (head == null) return;

        Node prev = null;
        Node cur = head;
        while(cur != null && cur.data != value) {
            prev = cur;
            cur = cur.next;
        }

        if (cur == null) return;
        if (prev == null) 
            head = head.next;
        else 
            prev.next = cur.next;
    }

    public void printAll() {
        Node p = head;
        while(p != null) {
            System.out.println(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }


    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }
    }

}