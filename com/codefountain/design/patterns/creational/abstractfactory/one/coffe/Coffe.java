package com.codefountain.design.patterns.creational.abstractfactory.one.coffe;

import com.codefountain.design.patterns.creational.abstractfactory.one.Drink;

public interface Coffe extends Drink {

    void prepareCoffe(boolean isSugar, boolean isExtraHot);
}
