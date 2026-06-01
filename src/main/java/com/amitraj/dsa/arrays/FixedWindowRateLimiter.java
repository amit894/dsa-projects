package com.amitraj.dsa.arrays;

import java.util.*;


import java.util.HashMap;

public class FixedWindowRateLimiter {

    long windowSize;
    int allowedRequestLimit;

    FixedWindowRateLimiter(long windowSize,  int allowedRequestLimit){
        this.windowSize =  windowSize;
        this.allowedRequestLimit = allowedRequestLimit;
    }

    private class UserRequest{
        long currentWindowStart;
        int requestCounter;

        UserRequest(long currentWindowStart, int requestCounter){
            this.currentWindowStart = currentWindowStart;
            this. requestCounter = requestCounter;

        }
    }

    HashMap<String, UserRequest> userRequests= new HashMap<>();

    boolean allowRequest (String userId){
        UserRequest u1 = userRequests.get(userId);
        if (u1==null)
        { u1 = new UserRequest(System.currentTimeMillis(),0);
           userRequests.put(userId,u1);
        }

        if (( System.currentTimeMillis()-u1.currentWindowStart)>=windowSize)
            {   u1.requestCounter = 0;
                u1.currentWindowStart = System.currentTimeMillis();
            }
        if (u1.requestCounter>=allowedRequestLimit)
            return false;

        u1.requestCounter++;

        return true;

    }


}
