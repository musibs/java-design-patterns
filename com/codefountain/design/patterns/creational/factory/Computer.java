package com.codefountain.design.patterns.creational.factory;

/**
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */
public abstract class Computer {

    public abstract int getMemory();
    public abstract int getHardDrive();
    public abstract int getProcessingCapacity();

    @Override
    public String toString() {
        return "[Memory: "+getMemory()+ " ,Hard Drive: "+getHardDrive()+" ,Processing Capacity: "+getProcessingCapacity()+"]";
    }
}
