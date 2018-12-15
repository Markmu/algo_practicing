/**
 * Bubble sort, Insertion sort, Selection sort 
 */
public class Sort1 {

    public static void bubbleSort(int[] arr, int n) {
        if (n <= 1) return;
    
        for (int i = 0; i < n; ++i) {

            boolean flag = false;
            for (int j = 0; j < n-i-1; ++j) {
                
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
    
    }
    

    public static void insertionSort(int[] arr, int n) {

        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = arr[i];
            int j = i-1;
            while (j >= 0) {
                if (arr[j] > value) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
                j--;
            }
            arr[j+1] = value;
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {10, 2, 99, 8, 3, 3, 0, 13, 33, 43, 22};
        // bubbleSort(array, array.length);
        insertionSort(array, array.length);
        for (int var : array) {
            System.out.print(var + " ");
        }
    }


}