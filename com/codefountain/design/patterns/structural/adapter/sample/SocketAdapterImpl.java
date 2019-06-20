package com.codefountain.design.patterns.structural.adapter.sample;

import java.util.Objects;

public class SocketAdapterImpl implements SocketAdapter {

    private Socket socket;

    public SocketAdapterImpl(Socket socket) {
        Objects.requireNonNull(socket);
        this.socket = socket;
    }

    @Override
    public Volt get110Volt() {
        return new Volt(socket.getVolt().getVoltValue()/2);
    }

    @Override
    public Volt get55Volt() {
        return new Volt(socket.getVolt().getVoltValue()/4);
    }
}
