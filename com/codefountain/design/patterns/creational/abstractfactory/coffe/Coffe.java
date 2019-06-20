package com.codefountain.design.patterns.creational.abstractfactory.coffe;

import com.codefountain.design.patterns.creational.abstractfactory.Drink;

public interface Coffe extends Drink {

    void prepareCoffe(boolean isSugar, boolean isExtraHot);
}
