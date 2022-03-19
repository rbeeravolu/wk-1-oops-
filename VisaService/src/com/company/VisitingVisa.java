package com.company;

public class VisitingVisa extends Decorator {

    public VisitingVisa(Item item) {
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
        System.out.println("Visiting Visa Approved");
    }
}