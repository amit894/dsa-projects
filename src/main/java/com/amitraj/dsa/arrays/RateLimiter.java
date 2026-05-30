package com.amitraj.dsa.arrays;

import java.util.*;


import java.util.HashMap;

import static java.lang.System.currentTimeMillis;

public class RateLimiter {
    long windowSize;
    int requestLimit;

    private class User{
        long windowStartTime;
        int requestCount;
    }

    HashMap<String,User> userRequest = new HashMap<>();

    public boolean allowRequests (User u1){
        if (currentTimeMillis() - u1.windowStartTime) > windowSize){
           u1.windowStartTime=currentTimeMillis();
            u1.requestCount=0;

         }
        if (u1.requestCount >=requestLimit)
              return false;

        u1.requestCount++;

        return true;
        }


    }

}