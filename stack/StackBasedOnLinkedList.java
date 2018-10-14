/**
 *  Stack based on linked list.
 *  1) push operation
 *  2) pop operation
 * 
 */
public class StackBasedOnLinkedList {

    private Node top = null;

    public void push(int value) {
        Node newNode = new Node(value, null);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null)
            return -1;
        int value = top.data;
        top = top.next;
        return value;
    }

    public void printAll() {
        Node cur = top;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
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
    
        public int getData() {
          return data;
        }
    }
}