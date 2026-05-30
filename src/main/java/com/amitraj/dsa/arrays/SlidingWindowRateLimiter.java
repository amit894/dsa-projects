package com.amitraj.dsa.arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SlidingWindowRateLimiter {
    long windowSize;
    int allowedRequests;

    private class UserRequest{
        long timestamp;

        UserRequest (long timestamp){
            this.timestamp =timestamp;

        }
    }



    Queue<UserRequest> userRequests = new LinkedList<>();

    boolean allowedRequests (){
        while ((!userRequests.isEmpty()&& System.currentTimeMillis()-userRequests.peek().timestamp)>=windowSize) {
            userRequests.remove();
        }

        if (userRequests.size()>= allowedRequests)
            return false;

            userRequests.add(new UserRequest(System.currentTimeMillis()));
            
        return true;

    }

}
