package com.mark.No_88_MergeSortedArray;

/**
 * Created by Mark on 2019-07-09.
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = nums1.length-1; i >= nums1.length-m; i--) {
            nums1[i] = nums1[i-(nums1.length-m)];
        }

        int index1 = nums1.length-m;
        int index2 = 0;
        int cur = 0;

        while (index1 < nums1.length && index2 < nums2.length && cur < nums1.length) {
            if (nums1[index1] < nums2[index2]) {
                nums1[cur] = nums1[index1];
                index1++;
            } else {
                nums1[cur] = nums2[index2];
                index2++;
            }
            cur++;
        }

        while (index1 < nums1.length) {
            nums1[cur++] = nums1[index1++];
        }
        while (index2 < nums2.length) {
            nums1[cur++] = nums2[index2++];
        }
    }
}
