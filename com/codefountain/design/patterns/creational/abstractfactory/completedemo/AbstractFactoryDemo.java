package com.codefountain.design.patterns.creational.abstractfactory.completedemo;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        CreditCardFactory abstractCreditCardFactory = CreditCardFactory.getCreditCardFactory(680);
        CreditCard creditCard = abstractCreditCardFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(creditCard.getClass());

        abstractCreditCardFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard creditCard1 = abstractCreditCardFactory.getCreditCard(CardType.GOLD);
        System.out.println(creditCard1.getClass());

    }
}
