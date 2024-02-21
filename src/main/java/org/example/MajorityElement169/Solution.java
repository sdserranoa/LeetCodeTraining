package org.example.MajorityElement169;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> occurrence = new HashMap<>();
        for (int val : nums) {
            if (occurrence.containsKey(val)) {
                occurrence.put(val, occurrence.get(val)+1);
                if (occurrence.get(val)>=(nums.length)/2) {
                    return val;
                }
            } else {
                occurrence.put(val,1);
            }
        }
        return 0;
    }
}
