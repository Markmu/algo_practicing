package com.mark.No_242_ValidAnagram;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr_s = s.toCharArray();
        char[] arr_t = t.toCharArray();

        int[] res_s = new int[26];
        int[] res_t = new int[26];

        for (char ch: arr_s) {
            res_s[ch - 'a'] += 1;
        }
        for (char ch: arr_t) {
            res_t[ch - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (res_s[i] != res_t[i]) {
                return false;
            }
        }
        return true;
    }

}
