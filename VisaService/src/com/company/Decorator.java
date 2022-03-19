package com.company;

public abstract class Decorator implements Item {

    private Item item;

    public Decorator(Item item) {
        this.item = item;
    }

    @Override
    public void VisaType() {
        this.item.VisaType();
    }
}
