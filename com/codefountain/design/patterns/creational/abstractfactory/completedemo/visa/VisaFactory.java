package com.codefountain.design.patterns.creational.abstractfactory.completedemo.visa;

import com.codefountain.design.patterns.creational.abstractfactory.completedemo.CardType;
import com.codefountain.design.patterns.creational.abstractfactory.completedemo.CreditCard;
import com.codefountain.design.patterns.creational.abstractfactory.completedemo.CreditCardFactory;
import com.codefountain.design.patterns.creational.abstractfactory.completedemo.Validator;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD: return new VisaGoldCreditCard();
            case PLATINUM: return new VisaBlackCreditCard();
            default:throw new IllegalArgumentException("Only Gold and Platinum are supported");
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD: return new VisaGoldCreditCardValidator();
            case PLATINUM: return new VisaBlackCreditCardValidator();
            default:throw new IllegalArgumentException("Only Gold and Platinum are supported");
        }
    }
}
