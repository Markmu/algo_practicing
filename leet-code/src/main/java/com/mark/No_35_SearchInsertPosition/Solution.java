package com.mark.No_35_SearchInsertPosition;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        if (nums == null) return 0;

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] <= target) {
                if (nums[mid] == target) return mid;
                else if (mid == nums.length-1) return nums.length;
                else if (nums[mid+1] > target) return mid + 1;
                else left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1,3,5,6}, 2));
    }

}
