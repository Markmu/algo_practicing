package com.mark.No_69_Sqrt;

public class Solution {

    public int mySqrt(int x) {
        if (x == 0) return 0;
        long left = 1l;
        long right = x >> 1l;
        long mid = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (mid*mid <= x) {
                if ((mid+1)*(mid+1) > x || mid*mid == x) return (int) mid;
                else left = mid+1;
            } else {
                right = mid - 1;
            }
        }
        return 1;
    }
}
