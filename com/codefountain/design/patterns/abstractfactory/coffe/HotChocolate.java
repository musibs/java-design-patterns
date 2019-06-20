package com.codefountain.design.patterns.abstractfactory.coffe;

public class HotChocolate implements Coffe {

    @Override
    public void prepareCoffe(boolean isSugar, boolean isExtraHot) {

        if(isSugar && isExtraHot){
            System.out.println("Your hot chocolate with sugar and extra hot is ready");
        }
        else if(isSugar){
            System.out.println("Your hot chocolate with extra sugar is ready");
        }
        else if(isExtraHot){
            System.out.println("Your extra hot, hot chocolate is ready");
        }
        else{
            System.out.println("Your hot chocolate is ready");
        }

    }
}
