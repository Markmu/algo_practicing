/**
 * Stack based on array
 */
public class StackBasedOnArray {

    private int[] stack;
    private int n = 0;

    public StackBasedOnArray(int n) {
        this.stack = new int[n];
    }

    public boolean empty() {
        return n == 0;
    }

    public void push(int i) throws Exception {
        if (n < stack.length) {
            stack[n] = i;
            n++;
        } else {
            throw new StackOverflowError();
        }
    }

    public int pop() throws Exception {
        if (n == 0) {
            throw new NullPointerException();
        }
        int tmp = stack[n-1];
        n--;
        return tmp;
    }

}