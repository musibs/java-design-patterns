package com.codefountain.design.patterns.creational.singleton.main;

/**
 * Singleton implementation with Eager Initialization approach
 *
 * Notes:
 *  Advantages:-
 *
 *      1. static variable -> This ensures only one copy in the JVM
 *      2. private constructor -> To prevent further instantiation
 *          (Can be exploited through reflection anyway)
 *      3. public static method -> A global entry point
 *      4. Useful as lightweight singleton implementation
 *
 *  Disadvantages:-
 *
 *      1. Object created well ahead the requirement
 *      2. No scope of exception handling
 *      3. Costly if heavyweight operations are done e.g. file system
 *         handling, database connection pool set up and so on
 *
 * @author Somnath Musib
 */

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){
        // No external instantiation
    }

    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }
}
