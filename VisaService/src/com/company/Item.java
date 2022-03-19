package com.company;

public interface Item {

    void Attach(Observer o);
    void Dettach(Observer o);
    void Notify();
    public void VisaType();
}
