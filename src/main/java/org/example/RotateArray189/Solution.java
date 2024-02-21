package org.example.RotateArray189;

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i= 0; i < n; i++) {
            int newIndex = (k % n)+i;
            if (newIndex > n-1) {
                newIndex-= n;
            }
            res[newIndex] = nums[i];
        }
        System.arraycopy(res, 0 , nums, 0, n);
    }
}
