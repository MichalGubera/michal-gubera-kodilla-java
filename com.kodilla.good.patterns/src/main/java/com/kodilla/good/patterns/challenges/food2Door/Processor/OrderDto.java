package com.kodilla.good.patterns.challenges.food2Door.Processor;

import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Shop;

public class OrderDto {
    private Shop shop;
    private boolean isOrdered;

    public OrderDto(final Shop shop, final boolean isOrdered) {
        this.shop = shop;
        this.isOrdered = isOrdered;
    }

    public Shop getShop() {
        return shop;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
