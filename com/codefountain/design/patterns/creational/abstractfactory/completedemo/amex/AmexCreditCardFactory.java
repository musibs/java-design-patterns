package com.codefountain.design.patterns.creational.abstractfactory.completedemo.amex;

import com.codefountain.design.patterns.creational.abstractfactory.completedemo.CardType;
import com.codefountain.design.patterns.creational.abstractfactory.completedemo.CreditCard;
import com.codefountain.design.patterns.creational.abstractfactory.completedemo.CreditCardFactory;
import com.codefountain.design.patterns.creational.abstractfactory.completedemo.Validator;

public class AmexCreditCardFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD: return new AmexGoldCreditCard();
            case PLATINUM: return new AmexPlatinumCreditCard();
            default:throw new IllegalArgumentException("Only Gold and Platinum are supported");
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD: return new AmexGoldCreditCardValidator();
            case PLATINUM: return new AmexPlatinumCreditCardValidator();
            default:throw new IllegalArgumentException("Only Gold and Platinum are supported");
        }
    }
}
