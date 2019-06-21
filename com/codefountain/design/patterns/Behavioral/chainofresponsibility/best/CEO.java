package com.codefountain.design.patterns.Behavioral.chainofresponsibility.best;

public class CEO extends Handler{

    public CEO(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        System.out.println("|CEO| Approved "+ request.getAmount() +"\nNote: CEO can approve any request");
    }
}
