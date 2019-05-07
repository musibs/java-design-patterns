package com.codefountain.design.patterns.singleton.main;

import java.io.Serializable;

/**
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */
public class SerializedSingleton implements Serializable {

    private  static final long serialVersionUID = -19894967496497494L;

    private SerializedSingleton(){}

    private static class SerializedSingletonHelper{
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SerializedSingletonHelper.INSTANCE;
    }

    /**
     * This prevents exploitation of singleton through Serialization.
     * It ensures the same instance is returned while de-serializing
     * @return
     */
    protected Object readResolve(){
        return getInstance();
    }
}
