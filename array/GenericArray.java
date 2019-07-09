import java.util.Arrays;

public class GenericArray<T> {

    private T[] data;
    private int size;

    public GenericArray(int capacity) {
        this.data = new T[capacity];
        this.size = 0;
    }

    public GenericArray() {
        this(10);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int count() {
        return this.size;
    }

    public int getCapacity() {
        return this.data.length;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void set(int index, T element) {
        checkIndex(index);
        data[index] = element;
    }

    public T get(int index) {
        checkIndex(index);
        return data[index];
    }
    
    public int find(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void addFirst(T element) {
        add(0, element);
    }

    public void addLast(T element) {
        add(size, element);
    }

    public void add(int index, T element) {
        checkIndex(index);
        if (size == data.length) {
            resize(data.length * 2);
        }
        
        for (int i = size-1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = element;
        size++;
    }

    public T removeFirst() {
        return remove(0);
    }

    public T removeLast() {
        return remove(size);
    }

    public void removeElement(T element) {
        int index = find(element);
        if (index != -1) {
            remove(index);
        }
    }

    public T remove(int index) {
        checkIndex(index);
        T ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        data[index] = null;

        if (data.length / 4 == size) {
            resize(data.length/2);
        }
        return ret;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IllegalArgumentException("Index Out if Bound");
        }
    }

    private void resize(int capacity) {
        T[] newArray = new T[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = data[i];
        }
        this.data = newArray;
    }

    @Override
    public String toString() {
        return "GenericArray [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

}