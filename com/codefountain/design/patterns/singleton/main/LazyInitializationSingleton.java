package com.codefountain.design.patterns.singleton.main;

import java.util.Objects;

/**
 *
 *  Lazy initialization of singleton
 *
 *  Note Thread Safe. In race condition, both threads can detect instance as
 *  null and create a copy of singleton class
 *
 * @author  Somnath Musib
 *
 */
public class LazyInitializationSingleton {


    private static LazyInitializationSingleton instance = null;

    private LazyInitializationSingleton(){}

    public static LazyInitializationSingleton getInstance(){
        if(Objects.isNull(instance)){
            instance = new LazyInitializationSingleton();
        }

        return instance;
    }
}
