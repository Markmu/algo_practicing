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
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
    
    }
    

    public static void main(String[] args) {
        int[] array = {10, 2, 99, 8, 3, 3, 0, 13, 33, 43, 22};
        bubbleSort(array, array.length);
        for (int var : array) {
            System.out.print(var + " ");
        }
    }


}