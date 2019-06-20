package com.codefountain.design.patterns.creational.factory;

/**
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */
public class FactoryMain {

    public static void main(String[] args){
        ComputerFactory computerFactory = ComputerFactory.getInstance();
        System.out.println(computerFactory.getComputer(ComputerClass.DESKTOP).toString());
        System.out.println(computerFactory.getComputer(ComputerClass.SERVER).toString());
    }
}
