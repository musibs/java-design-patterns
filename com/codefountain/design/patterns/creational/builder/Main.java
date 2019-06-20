package com.codefountain.design.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        NutritionFact facts = new NutritionFact.Builder(100, 3)
                .calories(160)
                .carbohydrate(200)
                .build();
        System.out.println(facts.toString());
    }
}
