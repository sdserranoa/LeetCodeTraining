package org.example.ContainsDuplicateII219;

import java.util.HashSet;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!seen.contains(nums[i])) {
                seen.add(nums[i]);
            } else {
                return true;
            }
            if(seen.size() >= k+1){
                seen.remove(nums[j++]);
            }
        }
        return false;
    }
}
