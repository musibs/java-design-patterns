package com.codefountain.design.patterns.creational.factory;

/**
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */
public class ComputerFactory {

    private ComputerFactory(){}

    private static class ComputerFactoryHelper{
        private static final ComputerFactory INSTANCE = new ComputerFactory();
    }

    public static ComputerFactory getInstance(){
        return ComputerFactoryHelper.INSTANCE;
    }

    public Computer getComputer(ComputerClass computerClass){
        switch (computerClass){
            case DESKTOP:
                return new Desktop(100,8,4);
            case SERVER:
                return new Server(1000, 64, 20);
            default: throw  new IllegalArgumentException("Invalid Computer class provided");
        }
    }
}
