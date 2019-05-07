package com.codefountain.design.patterns.singleton;

import java.util.Objects;

/**
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    /**
     * This method performs only one level null check for instance
     *
     * Un-necessary synchronization for later invocations. Only first thread
     * requires synchronization to create the object. Subsequent calls can
     * simply do the null check. Performance penalty for synchronization
     *
     * @return ThreadSafeSingleton
     */
    public static synchronized ThreadSafeSingleton getInstanceExcessiveSync(){
        if(Objects.isNull(instance)){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * This method re-orders the null check to avoid the problem stated
     * in getSingleCheckInstance().
     *
     * But this implementation is broken as two threads A and B both can
     * simultaneously hit the first null check and one will be through the
     * synchronization block but other will wait on synchronization.
     *
     * However, once thread A is done with synchronization, thread B will
     * enter an create another instance of instance
     *
     * @return ThreadSafeSingleton
     */
    public static ThreadSafeSingleton getInstanceLessSyncbutBroken(){
        if(Objects.isNull(instance)) {
            synchronized (ThreadSafeSingleton.class) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }


    /**
     * This method avoids the problem stated in getInstanceLessSyncbutBroken
     * by performing a double check
     *
     * @see {@link http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html}
     *
     *
     * @return ThreadSafeSingleton
     */
    public static ThreadSafeSingleton getInstance(){
        if(Objects.isNull(instance)) {
            synchronized (ThreadSafeSingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
