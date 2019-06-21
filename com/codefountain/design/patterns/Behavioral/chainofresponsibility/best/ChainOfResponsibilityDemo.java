package com.codefountain.design.patterns.Behavioral.chainofresponsibility.best;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        CEO ceo = new CEO(null);
        VP vp = new VP(ceo);
        Director director = new Director(vp);

        Request request1 =  new Request(RequestType.CONFERENCE, 400);
        Request request2 =  new Request(RequestType.PURCHASE, 900);
        Request request3 =  new Request(RequestType.PURCHASE, 5000);

        director.handleRequest(request1);
        director.handleRequest(request2);
        director.handleRequest(request3);

    }
}
