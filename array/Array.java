/**
 *  1) Insert operation, delete operation and random access by index of array.
 *  2) The type of element is Integer.
 * 
 *  Author: Mark C. Mu
 */

public class Array {

    private int array[];
    private int n;
    private int count;

    public Array(int capacity) {
        this.array = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    public int find(int index) {
        if (index < 0 || index >= this.count)
            return -1;
        return this.array[index];
    }

    public boolean insert(int value, int index) {
        if (index < 0 || index >= this.count)
            return false;
        if (this.count == this.n)
            return false;
        for (int i = this.count-1; i > index; i--) 
            this.array[i+1] = this.array[i];
        this.array[index] = value;
        this.count++;
        return true;
    }

    public boolean addToTail(int value) {
        if (this.count == this.n) 
            return false;
        this.array[this.count++] = value;
        return true;
    }

    public boolean delete(int index) {
        if (index < 0 || index >= this.count)
            return false;
        for (int i = index; i < this.count; i++) 
            this.array[i] = this.array[i+1];
        this.count--;
        return true;
    }

    public void printAll() {
        for (int i = 0; i < this.count; i++) 
            System.out.println(this.array[i] + " ");
        System.out.println();
    }

}