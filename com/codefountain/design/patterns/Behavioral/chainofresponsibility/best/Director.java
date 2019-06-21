package com.codefountain.design.patterns.Behavioral.chainofresponsibility.best;

public class Director extends Handler {

    public Director(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {

        if(request.getRequestType() == RequestType.CONFERENCE
        && request.getAmount() <= 500){
            System.out.println("|Director| Approved "+ request.getAmount() +" \nNote:Director can approve up to 500 AUD\n");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
