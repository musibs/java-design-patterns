package com.codefountain.design.patterns.factory;

/**
 * @author Somnath Musib on 7/05/2019
 * @project design-patterns
 */
public class Server extends Computer {

    private int hardDrive;
    private int memory;
    private int processingCapacity;

    public Server(int hardDrive, int memory, int processingCapacity){
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.processingCapacity = processingCapacity;
    }

    @Override
    public int getHardDrive() {
        return hardDrive;
    }

    @Override
    public int getMemory() {
        return memory;
    }

    @Override
    public int getProcessingCapacity() {
        return processingCapacity;
    }
}


