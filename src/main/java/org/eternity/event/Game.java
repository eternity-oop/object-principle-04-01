package org.eternity.event;

public class Game {
    private String name;
    private long price;
    private double discountRate;

    public Game(String name, long price, double discountRate) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }

    public long calculateSalePrice() {
        return price - (long)Math.ceil(price * discountRate);
    }
}
