package com.viso.lambda.p2;

@FunctionalInterface
public interface PriceDashboard {
    Price getPrice(String symbol);
}
