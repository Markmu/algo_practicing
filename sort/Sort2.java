/**
 * Merge sort & Quick sort
 */
public class Sort2 {

    public static void merge_sort(int[] array, int n) {
        
        mergeSort(array, 0, n-1);

    }

    public static void mergeSort(int[] array, int begin, int end) {
        
        if (begin >= end) return;

        int mid = (begin + end) / 2;
        mergeSort(array, begin, mid);
        mergeSort(array, mid+1, end);
        merge(array, begin, mid, end);

    }

    public static void merge(int[] array, int left, int mid, int right) {

        int[] tmp = new int[right-left+1];

        int i = left, j = mid+1;
        int ti = 0;
        while (i <= mid && j <= right) {
            if (array[i] < array[j]) {
                tmp[ti++] = array[i++];
            } else {
                tmp[ti++] = array[j++];
            }
        }
        while (i <= mid) {
            tmp[ti++] = array[i++];
        }
        while (j <= right) {
            tmp[ti++] = array[j++];
        }
        ti = 0;
        for (int arr_i = left; arr_i <= right; arr_i++) {
            array[arr_i] = tmp[ti++];
        }

    }

    public static void quick_sort(int[] array, int n) {
        quickSort(array, 0, n-1);
    }

    public static void quickSort(int[] array, int left_i, int right_i) {
        if (left_i >= right_i) return;

        int p = partition(array, left_i, right_i);
        quickSort(array, left_i, p-1);
        quickSort(array, p+1, right_i);

    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left;
        for(int j = left; j < right; ++j) {
            if (array[j] < pivot) {
                swap(array, i, j);
                i++;
            }
        }
        swap(array, i, right);
        return i;
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {9,12,34,0,39,88,47,399,287,44,22,12,1,23,12,22,2};
        // merge_sort(array, array.length);
        quick_sort(array, array.length);
        for(int var: array) {
            System.out.print(var + " ");
        }
    }
}