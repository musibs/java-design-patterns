package com.codefountain.design.patterns.structural.adapter.sample;

public class Socket {

    public Volt getVolt(){
        return new Volt(220);
    }
}
