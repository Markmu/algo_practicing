package com.mark.No_219_ContainsDuplicate_II;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums == null || nums.length < 2) return false;

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j] && j-i <=k) {
                    return true;
                }
            }
        }

        return false;

    }

}
