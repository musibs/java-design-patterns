package com.codefountain.design.patterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        System.out.println(AbstractDrinksFactory.INSTANCE.getDrinksFactory(DrinksType.TEA));

    }
}
