package com.codefountain.design.patterns.creational.abstractfactory.completedemo.amex;

import com.codefountain.design.patterns.creational.abstractfactory.completedemo.Validator;

public class AmexPlatinumCreditCardValidator implements Validator {
    @Override
    public boolean isValid() {
        return false;
    }
}
