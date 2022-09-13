package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    public void testBigmackNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(RollType.WITH_SEZAME)
                .burgers(4)
                .sauce(SauceType.THOUSAND_ISLANDS)
                .ingredients(IngredientsType.LETTUCE)
                .ingredients(IngredientsType.CHILI_PEPPERS)
                .ingredients(IngredientsType.MUSHROOMS)
                .ingredients(IngredientsType.CUCUMBER)
                .build();
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyBurgers);
        assertEquals(4, howManyIngredients);
        assertTrue(bigmac.getIngredients().contains(IngredientsType.CHILI_PEPPERS));
        assertFalse(bigmac.getIngredients().contains(IngredientsType.BACON));
    }
}