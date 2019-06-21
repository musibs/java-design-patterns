package com.codefountain.design.patterns.Behavioral.chainofresponsibility.best;

public class Request {

    private RequestType requestType;
    private double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestType=" + requestType +
                ", amount=" + amount +
                '}';
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
