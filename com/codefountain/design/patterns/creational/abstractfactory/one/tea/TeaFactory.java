package com.codefountain.design.patterns.creational.abstractfactory.one.tea;

import com.codefountain.design.patterns.creational.abstractfactory.one.Drink;
import com.codefountain.design.patterns.creational.abstractfactory.one.DrinksFactory;

public enum TeaFactory implements DrinksFactory {

    INSTANCE;

    public Tea getTea(TeaType teaType, boolean isSugar){
        switch (teaType){
            case ASSAM: return new AssamTea();
            case DARJEELING: return new DarjeelingTea();
            default: throw new IllegalArgumentException("We sell only Assam and Darjeeling tea");
        }
    }


    @Override
    public Drink getDrink() {
        return getTea(TeaType.ASSAM, false);
    }
}
