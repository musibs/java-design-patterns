package com.codefountain.design.patterns.abstractfactory.coffe;

import com.codefountain.design.patterns.abstractfactory.Drink;

public interface Coffe extends Drink {

    void prepareCoffe(boolean isSugar, boolean isExtraHot);
}
