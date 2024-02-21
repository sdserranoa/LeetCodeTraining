package org.example.HIndex274;

public class Solution {

    public static int hIndex(int[] citations) {

        int n = citations.length;
        int[] counts = new int[n + 1];

        // Step 1: Count the number of papers with at least i citations.
        for (int citation : citations) {
            int index = Math.min(citation, n);
            counts[index]++;
        }

        // Step 2: Calculate the h-index.
        int sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += counts[i];
            if (sum >= i) {
                return i;
            }
        }

        return 0; // Default case
    }
}
