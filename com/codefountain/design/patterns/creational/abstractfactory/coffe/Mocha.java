package com.codefountain.design.patterns.creational.abstractfactory.coffe;

public class Mocha implements Coffe {
    @Override
    public void prepareCoffe(boolean isSugar, boolean isExtraHot) {

        if(isSugar && isExtraHot){
            System.out.println("Your mocha with sugar and extra hot is ready");
        }
        else if(isSugar){
            System.out.println("Your mocha with extra sugar is ready");
        }
        else if(isExtraHot){
            System.out.println("Your extra hot mocha is ready");
        }
        else{
            System.out.println("Your mocha is ready");
        }

    }
}
