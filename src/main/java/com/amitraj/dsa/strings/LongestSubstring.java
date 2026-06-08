package main.java.com.amitraj.dsa.strings;

import java.util.HashMap;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s){

    int maxLength = 0;
    HashMap< Character, Integer> indices = new HashMap<>();

        for ( int left=0,right=0; right<s.length();right++){
        if (indices.containsKey(s.charAt(right)))
            left = Math.max(left,indices.get(s.charAt(right))+1);

        maxLength = Math.max(maxLength,right-left+1);
        indices.put(s.charAt(right),right);


    }

        return maxLength;
    }

}
