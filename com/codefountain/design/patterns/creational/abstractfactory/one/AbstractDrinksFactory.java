package com.codefountain.design.patterns.creational.abstractfactory.one;

import com.codefountain.design.patterns.creational.abstractfactory.one.coffe.CoffeFactory;
import com.codefountain.design.patterns.creational.abstractfactory.one.tea.TeaFactory;

public enum AbstractDrinksFactory {

    INSTANCE;

    public DrinksFactory getDrinksFactory(DrinksType drinksType){
        switch (drinksType){
            case TEA: return TeaFactory.INSTANCE;
            case COFFE: return CoffeFactory.INSTANCE;
            default: throw new IllegalArgumentException("We sell Tea and Coffe only.");
        }
    }

}
