package com.company;

public class H1bVisa extends Decorator{

    public H1bVisa(Item item) {
        super(item);
    }

    @Override
    public void Attach(Observer o) {

    }

    @Override
    public void Dettach(Observer o) {

    }

    @Override
    public void Notify() {

    }

    @Override
    public void VisaType() {
        super.VisaType();
        System.out.println("H1b visa approved");
    }

}
