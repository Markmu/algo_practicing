package com.mark.No_239_SlidingWindowMaximum;

import java.util.LinkedList;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null) return null;
        if (nums.length == 0) return new int[0];
        LinkedList<Integer> window = new LinkedList<>();
        int[] result = new int[nums.length - (k - 1)];
        for (int i = 0; i < nums.length; i++) {
            if (i >= k && window.getFirst() <= i - k) {
                window.removeFirst();
            }
            while(!window.isEmpty() && nums[window.getLast()] <= nums[i]) {
                window.removeLast();
            }
            window.addLast(i);
            if (i >= k - 1) {
                result[i - (k - 1)] = nums[window.getFirst()];
            }
        }
        return result;
    }

}
