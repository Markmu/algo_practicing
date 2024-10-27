public class S5003_DynamicArray {

  static class MyArray {
    private int[] arr;
    private int len;
    private int top;

    public MyArray() {
      this.len = 4;
      this.arr = new int[len];
      this.top = 0;
    }

    public boolean insert(int index, int value) {
      if (index < 0 || index >= this.len) {
        return false;
      }
      if (index > this.top) {
        return false;
      }
      if (top == len - 1) {
        scaleUp();
      }

      for (int i = top; i >= index; --i) {
        this.arr[i + 1] = this.arr[i];
      }

      this.arr[index] = value;
      this.top++;
      return true;
    }

    private void scaleUp() {
      int[] newArr = new int[len * 2];
      for (int i = 0; i < len; ++i) {
        newArr[i] = arr[i];
      }
      this.arr = newArr;
      this.len = len * 2;
    }

    public int deleteElem(int index) {
      if (index < 0 || index >= len) {
        return -1;
      }
      if (index >= this.top) {
        return -1;
      }
      int deleteEle = this.arr[index];

      for (int i = index + 1; i < top; ++i) {
        this.arr[i - 1] = this.arr[i];
      }

      this.top--;
      return deleteEle;
    }

    public int get(int index) {
      if (index < 0 || index >= this.top) {
        return -1;
      }
      return this.arr[index];
    }

  }

  public static void main(String[] args) {
    MyArray array = new MyArray();

    array.insert(0, 1);
    array.insert(1, 2);
    array.insert(2, 3);
    array.insert(3, 4);
    array.insert(0, 10);
    
    System.out.println(array.deleteElem(2));

    array.insert(0, 9);

    System.out.println(array.toString());

  }

}
