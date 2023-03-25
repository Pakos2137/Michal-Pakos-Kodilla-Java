package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final BigMacBun bun;
    private final int burgers;
    private final BigMacSouces sauce;
    private List<BigMacIngredients> ingredients = new ArrayList<>();

    private Bigmac(BigMacBun bun, int burgers, BigMacSouces sauce, List<BigMacIngredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public BigMacBun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public BigMacSouces getSauce() {
        return sauce;
    }

    public List<BigMacIngredients> getIngredients() {
        return ingredients;
    }
    public static class BigmacBuilder {
        private BigMacBun bun;
        private int burgers;
        private BigMacSouces sauce;
        private List<BigMacIngredients> ingredients = new ArrayList<>();

        public BigmacBuilder() {
        }
        public BigmacBuilder bun(BigMacBun bun) {
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(BigMacSouces sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder addIngredient(BigMacIngredients ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }
        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}