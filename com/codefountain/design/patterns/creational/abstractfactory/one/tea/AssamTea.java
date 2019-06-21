package com.codefountain.design.patterns.creational.abstractfactory.one.tea;

public class AssamTea implements  Tea {

    @Override
    public void prepareTea(boolean isSugar) {
        if(isSugar){
            System.out.println("Assam Tea with Sugar");
        }
        else{
            System.out.println("Assam Tea without Sugar");
        }
    }
}
