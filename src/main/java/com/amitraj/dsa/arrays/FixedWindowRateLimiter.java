package com.amitraj.dsa.arrays;

import java.util.*;


import java.util.HashMap;

public class FixedWindowRateLimiter {
    long windowSize;
    int allowedRequests;

    private class UserRequest{
        long currentwindowStartTime;
        int requestCount;

    }

    Map < String, UserRequest> userRequests = new HashMap<>();

    public boolean allowedRequest(UserRequest u1){
        if (u1==null){
            u1 = new UserRequest();
            u1.currentwindowStartTime = System.currentTimeMillis();
            u1.requestCount = 0;
        }
        if (( System.currentTimeMillis()-u1.currentwindowStartTime)> windowSize){
            u1.currentwindowStartTime=System.currentTimeMillis();
            u1.requestCount=0;
        }
        if(u1.requestCount>=allowedRequests){
            System.out.println("Window exhausted for the given user");
            return false;
        }

        u1.requestCount++;

        return true;
    }

}
