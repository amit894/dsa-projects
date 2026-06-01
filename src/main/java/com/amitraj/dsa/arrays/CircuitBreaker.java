package com.amitraj.dsa.arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CircuitBreaker {
    int failureThreshold;
    long lastFailureTime;
    long resetTimeout;
    int failureCount;
    public Status status;

    CircuitBreaker (int failureThreshold, int failureCount, long resetTimeout){
        this.failureThreshold = failureThreshold;
        this.failureCount = failureCount;
        this.resetTimeout = resetTimeout;
    }

    enum Status {OPEN, CLOSED, HALF_OPEN};

    void recordSuccess(){
        failureCount = 0;
        if (status==Status.HALF_OPEN)
            status=Status.CLOSED;
    }
    void recordFailure (){
        failureCount ++;
        lastFailureTime = System.currentTimeMillis();
        if (status==Status.HALF_OPEN)
            status=Status.OPEN;
        if (failureCount>=failureThreshold)
            status=Status.OPEN;

    }

    boolean allowRequest(){
        if (status==Status.OPEN && (System.currentTimeMillis()-lastFailureTime)>resetTimeout)

        { status = Status.HALF_OPEN;
            return true;
        }
        if (status == Status.CLOSED)
            return true;
        if (status == Status.OPEN)
            return false;
        
        return true;
    }


}
