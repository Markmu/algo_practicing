package com.mark.No_98_ValidateBinarySearchTree;

import com.mark.TreeNode;

public class Solution {

    private Integer pre = null;

    public boolean isValidBST(TreeNode root) {
//        return inorder(root);
        return helper(root,null, null);
    }


    private boolean helper(TreeNode root, Integer low, Integer high) {
        if (root == null) return true;

        int val = root.val;
        if (low != null && val <= low)
            return false;
        if (high != null && val >= high)
            return false;

        if (!helper(root.left, low, val))
            return false;
        if (!helper(root.right, val, high))
            return false;
        return true;
    }


    private boolean inorder(TreeNode root) {
        if (root == null) return true;

        if (!inorder(root.left)) return false;

        if (pre != null && pre >= root.val) {
            return false;
        }
        pre = root.val;

        return inorder(root.right);
    }

}
