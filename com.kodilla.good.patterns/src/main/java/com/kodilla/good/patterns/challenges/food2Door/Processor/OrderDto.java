package com.kodilla.good.patterns.challenges.food2Door.Processor;

import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Supplier;

public class OrderDto {
    private Supplier supplier;
    private boolean isOrdered;

    public OrderDto(final Supplier supplier, final boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
