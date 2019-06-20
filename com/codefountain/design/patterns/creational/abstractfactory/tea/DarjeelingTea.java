package com.codefountain.design.patterns.creational.abstractfactory.tea;

public class DarjeelingTea implements  Tea {
    @Override
    public void prepareTea(boolean isSugar) {
        if(isSugar){
            System.out.println("Darjeeling Tea with Sugar");
        }
        else{
            System.out.println("Darjeeling Tea without Sugar");
        }
    }
}
