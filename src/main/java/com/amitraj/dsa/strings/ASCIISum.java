package main.java.com.amitraj.dsa.strings;

public class ASCIISum {

    private int [] ASCIISum(String s){
        int lowerSum = 0;
        int upperSum = 0;

        for ( int i=0; i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i)))
                upperSum += (int) s.charAt(i);
            if (Character.isLowerCase(s.charAt(i)))
                lowerSum += (int) s.charAt(i);

        }

        return ( new int[] {upperSum,lowerSum});

    }


}
