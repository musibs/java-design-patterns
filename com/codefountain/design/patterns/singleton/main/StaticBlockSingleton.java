package com.codefountain.design.patterns.singleton.main;

/**
 * Static block implementation of singleton class
 *
 * It is of same as of {@link EagerInitializedSingleton} with the
 * difference that this approach provides a scope to handle exception
 *
 * @author  Somnath Musib
 */
public class StaticBlockSingleton {

    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){}

    static {
        try{
            INSTANCE = new StaticBlockSingleton();
        }
        catch(Exception exception){
            throw new RuntimeException(exception);
        }
    }

    public static StaticBlockSingleton getInstance(){
        return INSTANCE;
    }
}
