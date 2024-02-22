package org.example.FindtheTownJudge997;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> seen = new HashSet<>();
        int[] trusts = new int[n];

        for (int i = 0; i < trust.length; i++) {
            int trusted = trust[i][1];
            trusts[trusted - 1]++;
            seen.add(trust[i][0]);
        }
        for (int i = 0; i < trusts.length; i++) {
            System.out.println(trusts[i] + " " + i + trusts[i]+1);
            if (trusts[i] == n - 1 && !seen.contains(i+1)) {
                return i+1;
            }
        }
        return -1;
    }
}
