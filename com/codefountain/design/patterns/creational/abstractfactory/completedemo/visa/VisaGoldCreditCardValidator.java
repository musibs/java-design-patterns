package com.codefountain.design.patterns.creational.abstractfactory.completedemo.visa;

import com.codefountain.design.patterns.creational.abstractfactory.completedemo.Validator;

public class VisaGoldCreditCardValidator implements Validator {
    @Override
    public boolean isValid() {
        return false;
    }
}
