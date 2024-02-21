package org.example.IsomorphicStrings205;

import java.util.HashMap;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!= t.length()) {
            return false;
        }

        HashMap<Character,Character> mappingst = new HashMap<>();
        HashMap<Character,Character> mappingts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (mappingst.containsKey(s.charAt(i)) && mappingts.containsKey(t.charAt(i))) {
                if (!(mappingst.get(s.charAt(i))== t.charAt(i))) {
                    return false;
                }
            } else if (!mappingst.containsKey(s.charAt(i)) ^ !mappingts.containsKey(t.charAt(i))){
                return false;
            } else {
                mappingst.put(s.charAt(i),t.charAt(i));
                mappingts.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
