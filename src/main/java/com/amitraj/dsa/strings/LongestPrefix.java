package main.java.com.amitraj.dsa.strings;

import java.util.Arrays;

public class LongestPrefix {

  private String substring (String[] strs ){
    Arrays.sort(strs, (a, b) -> a.length() - b.length());
    String comparison_string = strs [0];
    for (int i=0; i<comparison_string.length();i++){
      String subs = comparison_string.substring(0, i+1);
      for (int j=0; j<strs.length;j++){
        if (!subs.equals(strs[j].substring(0,i+1)))
          return comparison_string.substring(0, Math.max(0, i));
      }
    }

    return comparison_string;


  }

}
