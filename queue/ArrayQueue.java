/**
 *  Queue based on Array.
 */
public class ArrayQueue {

    private String data[] = null;
    private int length = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int length) {
        this.length = length;
        data = new String[length];
    }

    public boolean enqueue(String value) {
        if (tail == length) {
            if (head == 0) return false;
            for (int i = head; i < tail; i++) {
                data[i-head] = data[i];
            }
            tail -= head;
            head = 0;
        }
        // reset the index after moving the element.
        data[tail++] = value;
        return true;
    }

    public String dequeue() {
        if (head == tail) return null;
        String value = data[head++];
        return value;
    }
}