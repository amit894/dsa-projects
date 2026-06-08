package com.amitraj.dsa.arrays;



public class CircuitBreaker {
    int failureThreshold;
    long lastFailureTime;
    long resetTimeout;
    int failureCount;
    private Status status;
    private boolean halfOpenProbeInFlight = false;


    CircuitBreaker (int failureThreshold, long resetTimeout){
        this.failureThreshold = failureThreshold;
        this.failureCount = 0;
        this.resetTimeout = resetTimeout;
        this.status= Status.CLOSED;
    }

    enum Status {OPEN, CLOSED, HALF_OPEN};

    synchronized void recordSuccess(){
        failureCount = 0;
        halfOpenProbeInFlight = false;  // release gate
        if (status==Status.HALF_OPEN)
            status=Status.CLOSED;
    }
    synchronized  void recordFailure (){
        failureCount ++;
        halfOpenProbeInFlight = false;  // release gate
        lastFailureTime = System.currentTimeMillis();
        if (status==Status.HALF_OPEN)
            status=Status.OPEN;
        if (failureCount>=failureThreshold)
            status=Status.OPEN;

    }

    synchronized boolean allowRequest(){
        if (status==Status.OPEN && (System.currentTimeMillis()-lastFailureTime)>resetTimeout)

        {  if (halfOpenProbeInFlight) return false;  // gate
            status = Status.HALF_OPEN;
            halfOpenProbeInFlight = true;
            return true;
        }

        if (status == Status.CLOSED)
            return true;
        if (status == Status.OPEN)
            return false;

        return true;
    }


}
