package com.mark.No_169_MajorityElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mark on 2019-07-11.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> quantities = new HashMap<>();

        for (int num : nums) {
            if (quantities.containsKey(num)) {
                quantities.put(num, quantities.get(num) + 1);
            } else {
                quantities.put(num, 1);
            }
        }

        Map.Entry<Integer, Integer> max = null;

        for (Map.Entry<Integer, Integer> entry : quantities.entrySet()) {
            if (max == null || entry.getValue() > max.getValue()) {
                max = entry;
            }
        }
        return max.getKey();
    }
}
