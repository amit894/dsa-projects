package main.java.com.amitraj.dsa.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergedIntervals {

    private int [] [] mergedInterval(int [] [] intervals){
        ArrayList<int []> mergedInterval = new ArrayList<>();

        Arrays.sort(intervals, (int[]a,int[] b)->a[0]-b[0]);
        int[] current = intervals[0];
        for ( int i=0; i<intervals.length;i++){
            if (intervals[i][0]<=current[1]){
                current[1]=Math.max(current[1],intervals[i][1]);
            }
            else {
                mergedInterval.add(current);
                current=intervals[i];
            }

        }
        mergedInterval.add(current);

        return (mergedInterval.toArray(new int [mergedInterval.size()][]));

    }
}
