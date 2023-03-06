package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String BUN="bun";
    private final String ROLL="roll";
    private final boolean sesame;
    private final int burgers;
    private final String souce;
    private final List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        private String bun;
        private String roll;
        private boolean sesame;
        private int burgers;
        private String souce;
        private List<String> ingredients = new ArrayList<>();



    }
}
