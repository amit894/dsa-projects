package main.java.com.amitraj.dsa.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {


    public List<List<String>> groupAnagrams(String [] s){
        HashMap<String, List<String>> map = new HashMap<>();
        char [] [] tmp_char = new char[s.length][];
        for (int i=0; i<s.length;i++){
            tmp_char[i] = s[i].toCharArray();
            Arrays.sort(tmp_char[i]);
            String key = tmp_char[i].toString();
            List<String> group = map.getOrDefault(key, new ArrayList<>());
            group.add(s[i]);
            map.put(key,group);

        }
        return new ArrayList<>(map.values());

    }
}
