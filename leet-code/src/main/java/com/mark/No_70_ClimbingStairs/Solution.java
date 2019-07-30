package com.mark.No_70_ClimbingStairs;

import java.util.HashMap;

/**
 * Created by Mark on 2019-07-22.
 */
public class Solution {

    private HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
//        return this.recursionWay(n);
        return this.dpWay(n);
    }

    private int dpWay(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int n1 = 1;
        int n2 = 2;
        int ret = 0;

        for (int i = 2; i < n; i++) {
            ret = n1 + n2;
            n1 = n2;
            n2 = ret;
        }
        return ret;
    }

    private int recursionWay(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int ret = recursionWay(n-1) + recursionWay(n-2);
        map.put(n, ret);
        return ret;
    }
}
