package com.codefountain.design.patterns.builder;

/**
 *
 * Builder design pattern
 *
 * A static builder class is used to build the object.
 * Static builder class forces to supply the required
 * parameters and then provides convenient methods to
 * add additional optional parameters and at the end
 * it builds the object
 *
 */

public class NutritionFact {

    private final int servingSize;
    private final int noOfServings;
    private final int calories;
    private final int carbohydrate;
    private final int fat;
    private final int sodium;
    private final int sugar;

    public NutritionFact(Builder builder) {
        this.servingSize = builder.servingSize;
        this.noOfServings = builder.noOfServings;
        this.calories = builder.calories;
        this.carbohydrate = builder.carbohydrate;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.sugar = builder.sugar;
    }

    @Override
    public String toString() {
        return "NutritionFact{" +
                "servingSize=" + servingSize +
                ", noOfServings=" + noOfServings +
                ", calories=" + calories +
                ", carbohydrate=" + carbohydrate +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", sugar=" + sugar +
                '}';
    }

    public static class Builder{

        private int servingSize;
        private int noOfServings;
        private int calories;
        private int carbohydrate;
        private int fat;
        private int sodium;
        private int sugar;

        public Builder(int servingSize, int noOfServings){
            this.servingSize = servingSize;
            this.noOfServings = noOfServings;
        }

        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }
        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder sugar(int sugar){
            this.sugar = sugar;
            return this;
        }

        public NutritionFact build(){
            return new NutritionFact(this);
        }
    }
}
