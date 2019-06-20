package com.codefountain.design.patterns.abstractfactory.coffe;

import com.codefountain.design.patterns.abstractfactory.Drink;
import com.codefountain.design.patterns.abstractfactory.DrinksFactory;

public enum CoffeFactory implements DrinksFactory {

    INSTANCE;

    public Coffe getCoffe(CoffeType coffeType, boolean isSugar, boolean isExtraHot){
        switch(coffeType){
            case HOT_CHOCLATE: return new HotChocolate();
            case MOCHA: return new Mocha();
            default:throw  new IllegalArgumentException("We only sell Hot Chocolate and Mocha at the moment.");
        }
    }

    @Override
    public Drink getDrink() {
        return null;
    }
}
