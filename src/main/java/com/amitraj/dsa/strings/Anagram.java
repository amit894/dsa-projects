package main.java.com.amitraj.dsa.strings;

import java.util.Arrays;

public class Anagram {

    private boolean isAnagram (String s, String t){
        if (s.length()!=t.length())
            return false;

        char [] temp_s = s.toCharArray();
        char [] temp_t = t.toCharArray();
        Arrays.sort(temp_t);
        Arrays.sort(temp_s);

        for (int i =0; i<temp_s.length;i++){
            if (temp_s[i]!=temp_t[i])
                return false;
        }

        return true;

    }
}
