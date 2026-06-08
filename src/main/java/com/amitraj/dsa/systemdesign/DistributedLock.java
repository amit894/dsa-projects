package main.java.com.amitraj.dsa.arrays;

import java.util.HashMap;

public class DistributedLock {
    long lockResetTimeout;
    String resourceID;
    String ownerID;
    Status status;


    DistributedLock(long lockResetTimeout, String resourceID){
        this.resourceID = resourceID;
        this.lockResetTimeout = lockResetTimeout;

    }

    enum Status {AVAILABLE, NOT_AVAIALBLE};

    private class LockManager {
        private HashMap<String, DistributedLock> locks = new HashMap<>();
        synchronized public boolean isLockAvailable(String user){
            return true;
        };
        synchronized public void acquire(){};
        synchronized public void release(){};
        synchronized public void expire(){};

    }
}


