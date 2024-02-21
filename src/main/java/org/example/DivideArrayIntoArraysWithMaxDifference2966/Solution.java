package org.example.DivideArrayIntoArraysWithMaxDifference2966;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int currentMin = nums[0];
        int count = 0;
        int[][] res = new int[nums.length / 3][3];
        int resIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 3 == 0) {
                currentMin = nums[i];
            }
            if (count >= 3 ) {
                count = 0;
                resIndex++;
            }
            if (nums[i] - currentMin <= k) {
                res[resIndex][count] = nums[i];
            }else {
                return new int[0][0];
            }
            count++;
        }
        return res;
    }
}
