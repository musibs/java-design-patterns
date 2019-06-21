package com.codefountain.design.patterns.creational.abstractfactory.completedemo.visa;

import com.codefountain.design.patterns.creational.abstractfactory.completedemo.Validator;

public class VisaBlackCreditCardValidator implements Validator {
    @Override
    public boolean isValid() {
        return false;
    }
}
