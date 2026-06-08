package com.amitraj.dsa.arrays;

import java.util.*;


import java.util.HashMap;

public class FixedWindowRateLimiter {
    long windowSize;
    int allowedRequestThreshold;

    FixedWindowRateLimiter (long windowSize, int allowedRequestThreshold){
        this.windowSize = windowSize ;
        this.allowedRequestThreshold = allowedRequestThreshold;
    }

    private class userRequest{
        long currentWindowStartTime;
        int requestCounter;

        userRequest(long currentWindowStartTime) {
            this.currentWindowStartTime = currentWindowStartTime;
            this.requestCounter = 0;
        }

    }

    private HashMap<String,userRequest > userRequests = new HashMap<>();

    boolean allowRequest(String userName){

        userRequest u1 = userRequests.get(userName);
        if (u1==null)
        {   u1= new userRequest(System.currentTimeMillis());
            userRequests.put(userName,u1);
        }
        if (System.currentTimeMillis()-u1.currentWindowStartTime>=windowSize)
        {   u1= new userRequest(System.currentTimeMillis());
            userRequests.put(userName,u1);
        }
        if (u1.requestCounter>=allowedRequestThreshold)
            return false;
        u1.requestCounter++;
        return true;
    }


}
