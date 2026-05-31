package com.amitraj.dsa.arrays;

import java.util.*;


import java.util.HashMap;

public class FixedWindowRateLimiter {
    long windowSize;
    Integer requestLimit;

    FixedWindowRateLimiter(long windowSize, Integer requestLimit){
        this.windowSize = windowSize;
        this.requestLimit = requestLimit;

    }

    public class UserRequest {
        long currentWindowStart;
        Integer requestCount;

        UserRequest(long currentWindowStart, Integer requestCount){
            this.currentWindowStart = currentWindowStart;
            this.requestCount = requestCount;

        }

    }

    HashMap<String, UserRequest> userRequests = new  HashMap<>();

    boolean allowRequest(String userId){
        UserRequest u1 = userRequests.get(userId);

        if (u1==null){
            u1 = new UserRequest(System.currentTimeMillis(),0);
            userRequests.put(userId,u1);
        }

        if ((System.currentTimeMillis()-u1.currentWindowStart)> windowSize){
            u1.currentWindowStart = System.currentTimeMillis();
            u1.requestCount = 0;

        }

        if (u1.requestCount>=requestLimit){
            return false;

        }

        u1.requestCount++;

        return  true;

    }


}
