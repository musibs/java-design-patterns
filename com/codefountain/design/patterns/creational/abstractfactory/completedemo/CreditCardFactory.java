package com.codefountain.design.patterns.creational.abstractfactory.completedemo;

import com.codefountain.design.patterns.creational.abstractfactory.completedemo.amex.AmexCreditCardFactory;
import com.codefountain.design.patterns.creational.abstractfactory.completedemo.visa.VisaFactory;

/**
 * Abstract factory class, creates different
 * credit card factories based on the credit
 * ratings
 *
 */
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore){

        if(creditScore > 650){
            return new AmexCreditCardFactory();
        }
        else{
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);
    public abstract Validator getValidator(CardType cardType);
}
