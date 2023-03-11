package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public final class Bigmac {
    private BigMacBun bun;
    private int burgers;
    private BigMacSouces souces;
    private List<BigMacIngredients> ingredients = new ArrayList<>();

    public BigMacBun getBun() {
        return bun;
    }
    public int getBurgers() {
        return burgers;
    }
    public BigMacSouces getSouces() {
        return souces;
    }
    public List<BigMacIngredients> getIngredients() {
        return ingredients;
    }

    public Bigmac(BigMacBun bun, int burgers, BigMacSouces souces, List<BigMacIngredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.souces = souces;
        this.ingredients = ingredients;
    }

    public static class BigMacBuilder {
        private BigMacBun bun;
        private int burgers;
        private BigMacSouces souces;
        private List<BigMacIngredients> ingredients = new ArrayList<>();

    }
    public BigMacBuilder bun(BigMacBun bun) {
        this.bun = bun;
        return null;
    }
    public Bigmac build() {
        return new Bigmac(bun,burgers,souces,ingredients);
    }
}
