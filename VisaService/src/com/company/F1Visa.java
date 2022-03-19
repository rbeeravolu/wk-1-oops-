package com.company;

public class F1Visa extends Decorator{

    public F1Visa(Item item) {
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
        System.out.println("F1 Visa Approved");
    }
}