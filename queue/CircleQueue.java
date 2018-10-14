public class CircleQueue {

    private String[] data;
    private int length = 0;
    private int head = 0;
    private int tail = 0;

    public CircleQueue(int length) {
        data = new String[length];
        this.length = length;
    }

    public boolean enqueue(String value) {
        if ((tail + 1) % length == head) return false;
        data[tail] = value;
        tail = (tail + 1) % length;
        return true;
    }

    public String dequeue() {
        if (head == tail) return null;
        String value = data[head];
        head = (head + 1) % length;
        return value;
    }

    public void printAll() {
        if (length == 0) return;
        for (int i = head; i % length != tail; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}