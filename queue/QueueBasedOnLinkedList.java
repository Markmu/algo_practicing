/** 
 *  Queue Based on linked list.
 * 
 */
public class QueueBasedOnLinkedList {

    private Node head = null;
    private Node tail = null;

    public void enqueue(String value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String dequeue() {
        if (head == null) return null;
        String value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public void printAll() {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    
    private static class Node {
        private String data;
        private Node next;
    
        public Node(String data, Node next) {
          this.data = data;
          this.next = next;
        }
    
        public String getData() {
          return data;
        }
    }
}