package com.codefountain.design.patterns.Behavioral.chainofresponsibility.best;

public class VP extends Handler {

    public VP(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE
                && request.getAmount() <= 1000){
            System.out.println("|VP| Approved "+ request.getAmount()+" \nNote: VP can approve up to 1000 AUD\n");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
