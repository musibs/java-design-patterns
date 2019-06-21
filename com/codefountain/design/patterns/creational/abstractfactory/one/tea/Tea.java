package com.codefountain.design.patterns.creational.abstractfactory.one.tea;

import com.codefountain.design.patterns.creational.abstractfactory.one.Drink;

public interface Tea extends Drink {

    void prepareTea(boolean isSugar);
}
