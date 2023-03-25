package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    public void testBigMac() {
        //Given
        Bigmac bigMac = new Bigmac.BigmacBuilder()
                .bun(BigMacBun.SESAME)
                .burgers(5)
                .addIngredient(BigMacIngredients.BEACON)
                .addIngredient(BigMacIngredients.CHEESE)
                .addIngredient(BigMacIngredients.CUCUMBER)
                .addIngredient(BigMacIngredients.ONION)
                .sauce(BigMacSouces.BARBEQUE)
                .build();

        assertEquals(5, bigMac.getBurgers());
        assertEquals(4, bigMac.getIngredients().size());
        assertEquals(BigMacBun.class, bigMac.getBun().getClass());
        assertEquals(BigMacSouces.class, bigMac.getSauce().getClass());
    }
}