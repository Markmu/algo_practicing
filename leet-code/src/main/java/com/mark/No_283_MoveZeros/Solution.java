package com.mark.No_283_MoveZeros;

public class Solution {

    public void moveZeroes(int[] nums) {
        int zeroNum = 0;
        int index = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroNum++;
            } else {
                nums[index++] = num;
            }
        }

        for (int i = 0; i < zeroNum; i++) {
            nums[nums.length - zeroNum + i] = 0;
        }
    }
}
