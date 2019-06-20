package com.codefountain.design.patterns.abstractfactory.tea;

import com.codefountain.design.patterns.abstractfactory.Drink;

public interface Tea extends Drink {

    void prepareTea(boolean isSugar);
}
