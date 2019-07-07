package com.mark.array.No_1_TwoSum;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];

            if (map.containsKey(target-nums[i])) {
                return new int[] {map.get(target-nums[i]), i};
            } else {
                map.put(nums[i], i);
            }

        }

        throw new IllegalArgumentException();
    }

}