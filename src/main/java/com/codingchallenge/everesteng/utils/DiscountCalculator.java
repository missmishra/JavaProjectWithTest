package com.codingchallenge.everesteng.utils;

public class DiscountCalculator {
    public static double applyDiscount(String offerCode, double totalCost) {
        switch (offerCode) {
            case "OFR001":
                return totalCost * 0.9; // 10% discount
            case "OFR002":
                return totalCost * 0.8; // 20% discount
            case "OFR003":
                return totalCost * 0.7; // 30% discount
            default:
                return totalCost;
        }
    }
}
