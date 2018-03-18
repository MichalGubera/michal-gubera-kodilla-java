package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            if (roll.equals("sesame") || roll.equals("classic")) {
                this.roll = roll;
                return this;
            } else {
                throw new IllegalStateException("rolls only goes in sesame or classic option");
            }
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals("standard") || sauce.equals("1000 islands") || sauce.equals("barbecue")) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("chosen sauce is not on the menue. \n" +
                        "you can only choose between: standard, 1000 islands and barbecue");
            }

        }

        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals("lettuce") || ingredient.equals("onion") || ingredient.equals("beacon") ||
                    ingredient.equals("cucumber") || ingredient.equals("chili") || ingredient.equals("mushrooms") ||
                    ingredient.equals("shrimps") || ingredient.equals("cheese")) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("the ingredient is not available, please choose one of possible " +
                        "ingredients: lettuce, onion, beacon, cucumber, chili, mushrooms, shrimps and cheese");
            }
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String roll, final int burgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
