package com.amitraj.dsa.arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SlidingWindowRateLimiter {
    long windowSize;
    int requestLimit;

    SlidingWindowRateLimiter(long windowSize,int requestLimit){
        this.windowSize = windowSize;
        this.requestLimit= requestLimit;
    }

    private class UserRequest{
        long timeStamp;

        UserRequest(long timeStamp){
            this.timeStamp = timeStamp;
        }

    }

    Queue <UserRequest> userRequests = new LinkedList<>();

    boolean allowRequest(UserRequest u1){
        if (userRequests.isEmpty()){
            u1 = new UserRequest(System.currentTimeMillis());
        }

        while ((userRequests.peek().timeStamp+windowSize)<System.currentTimeMillis()){
            userRequests.poll();
        }

        if(userRequests.size()>=requestLimit){
            return false;
        }

        userRequests.add(u1);

        return  true;

    }

}

