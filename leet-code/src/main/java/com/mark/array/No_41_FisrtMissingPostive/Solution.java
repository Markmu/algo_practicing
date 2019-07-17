package com.mark.array.No_41_FisrtMissingPostive;

/**
 * Created by Mark on 2019-07-17.
 */
public class Solution {

    public int firstMissingPositive(int[] nums) {
        if (nums == null) return 1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            while (num > 0 && num < n && nums[num-1] != num) {
                int tmp = nums[i];
                nums[i] = nums[num-1];
                nums[num-1] = tmp;
                num = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return n+1;
    }

}
