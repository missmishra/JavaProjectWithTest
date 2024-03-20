package com.codingchallenge.everesteng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codingchallenge.everesteng.utils.DiscountCalculator;



public class DiscountCalculatorTest {

    @Test
    public void testApplyDiscount() {
        double totalCost = 1000.0;
        double expectedDiscountedCost;

        expectedDiscountedCost = 900.0;
        double actualDiscountedCost = DiscountCalculator.applyDiscount("OFR001", totalCost);
        assertEquals(expectedDiscountedCost, actualDiscountedCost, 0.001);

        expectedDiscountedCost = 800.0;
        actualDiscountedCost = DiscountCalculator.applyDiscount("OFR002", totalCost);
        assertEquals(expectedDiscountedCost, actualDiscountedCost, 0.001);

        expectedDiscountedCost = 700.0;
        actualDiscountedCost = DiscountCalculator.applyDiscount("OFR003", totalCost);
        assertEquals(expectedDiscountedCost, actualDiscountedCost, 0.001);

        expectedDiscountedCost = totalCost;
        actualDiscountedCost = DiscountCalculator.applyDiscount("INVALID", totalCost);
        assertEquals(expectedDiscountedCost, actualDiscountedCost, 0.001);
    }
}
