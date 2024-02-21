package org.example.MissingNumber268;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n +1)*n/2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum+=nums[i];
        }
        return total-sum;
    }
}
