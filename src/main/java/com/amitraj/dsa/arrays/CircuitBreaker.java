package com.amitraj.dsa.arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CircuitBreaker {
    int failureThreshold;
    long resetTimeOut;
    public Status status;
    int failureCount;
    long lastFailureTime;

    CircuitBreaker(long requestTimeout, int failureThreshold,long resetTimeOut){
        this.failureThreshold = failureThreshold;
        this.resetTimeOut = resetTimeOut;
        this.status= Status.CLOSED;
        this.failureCount = 0;
    }


    public enum Status {
        OPEN, CLOSED, HALF_OPEN
    }


    boolean allowRequest(){
        if (status == Status.CLOSED)
            return true;

        if (status == Status.OPEN) {

            if (System.currentTimeMillis()
                    - lastFailureTime >= resetTimeOut) {
                status = Status.HALF_OPEN;
                return true;
            }

            return false;
        }

        return true;
    };

    void record_success(){
        failureCount=0;
        if (status==Status.HALF_OPEN){
            status=Status.CLOSED;
        }

    }

    void record_failure(){
        failureCount ++;
        lastFailureTime=System.currentTimeMillis();
        if (failureCount>=failureThreshold){
            status=Status.OPEN;
        }
        if (status==Status.HALF_OPEN){
            status=Status.OPEN;
        }

    }

}
