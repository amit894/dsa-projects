package com.amitraj.dsa.arrays;

import java.util.*;


import java.util.HashMap;

public class SlidingWindowRateLimiter {

    long windowSize;
    int allowedRequestLimit;

    SlidingWindowRateLimiter(long windowSize,  int allowedRequestLimit){
        this.windowSize =  windowSize;
        this.allowedRequestLimit = allowedRequestLimit;
    }

    private class UserRequest{
        long timeStamp;

        UserRequest(long timeStamp){
            this.timeStamp = timeStamp;
        }
    }

    Queue<UserRequest> userRequests= new LinkedList<>();

    boolean allowRequest (UserRequest u1){
        if (userRequests.isEmpty())
            userRequests.add(new UserRequest(System.currentTimeMillis()));
        while ((System.currentTimeMillis()-userRequests.peek().timeStamp)>=windowSize)
            userRequests.poll();

        if (userRequests.size()>=allowedRequestLimit)
            return false;

        userRequests.add(u1);

        return true;
    }

}
