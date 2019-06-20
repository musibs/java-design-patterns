package com.codefountain.design.patterns.creational.singleton.main;

/**
 * This implementation is done by Bill Pugh to avoid the
 * issues of {@link EagerInitializedSingleton}.
 *
 * In the implementation, static inner class is not loaded until
 * an invocation is made to getInstance method
 *
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */
public class BillPughSingleton {


    private BillPughSingleton(){}

    private static class SingletonHelper{

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
