package com.codefountain.design.patterns.creational.abstractfactory.tea;

import com.codefountain.design.patterns.creational.abstractfactory.Drink;

public interface Tea extends Drink {

    void prepareTea(boolean isSugar);
}
