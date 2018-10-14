/**
 *  1) Reverse the linked list.
 *  2) Check if a circle in the list.
 *  3) Merge two sorted linked lists.
 *  4) Delete the last Kth node in the list.
 *  5) Get the intermidia node of the list.
 *  
 */

 public class LinkedListAlgo {

    public static Node reverse(Node list) {
        Node resultHead = null;
        Node prev = null;
        Node cur = list;
        while(cur != null) {
            if (cur.next == null) {
                resultHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = cur.next;
        }
        return resultHead;
    }

    public static boolean ifCircle(Node list) {
        if (list == null) return false;
        Node slow = list;
        Node fast = list.next;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }

        return false;
    }

    public static Node merge(Node listA, Node listB) {
        if (listA == null) return listB;
        if (listB == null) return listA;
        Node newList = null;

        Node curA = listA;
        Node curB = listB;
        if (curA.data < curB.data) {
            newList = curA;
            curA = curA.next;
        } else {
            newList = curB;
            curB = curB.next;
        }
        Node c = newList;
        while(curA != null && curB != null) {
            if (curA.data < curB.data) {
                c.next = curA;
                curA = curA.next;
            } else {
                c.next = curB;
                curB = curB.next;
            }
            c = c.next;
        }
        if (curA != null) {
            c.next = curA;
        } else {
            c. next = curB;
        }
        return newList;
    }

    public static Node deleteKthNode(Node list, int k) {
        Node fast = list;
        int stepNum = 1;
        while(fast != null && stepNum++ < k)
            fast = fast.next;
        if (fast == null) return null;

        Node slow = list;
        Node prev = null;
        while(fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev == null) 
            list = list.next;
        else 
            prev.next = slow.next;
        return list;
    }

    public static Node getIntermidiaNode(Node list) {
        if (list == null) return null;

        Node fast = list;
        Node slow = list;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void printAll(Node list) {
        Node cur = list;
        while(cur != null) {
            System.out.println(cur.data + " ");
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