package com.mark.No_15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mark on 2019-07-10.
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i-1] == nums[i]) {
                continue;
            }
            int a = nums[i];
            int low = i+1;
            int high = nums.length-1;
            while (low < high) {
                int b = nums[low];
                int c = nums[high];
                if (a+b+c == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(a);
                    list.add(b);
                    list.add(c);
                    result.add(list);
                    while (high > 0 && nums[high] == nums[high-1]) {
                        high--;
                    }
                    while (low < nums.length-1 && nums[low] == nums[low+1]) {
                        low++;
                    }
                    high--;
                    low++;
                } else if (a+b+c > 0) {
                    while (high > 0 && nums[high] == nums[high-1]) {
                        high--;
                    }
                    high--;
                } else {
                    while (low < nums.length-1 && nums[low] == nums[low+1]) {
                        low++;
                    }
                    low++;
                }
            }
        }
        return result;
    }

}
