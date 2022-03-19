package com.company;


import java.util.ArrayList;

public class VisaOffice implements Item {

    private ArrayList<Visa> visa;
    private ArrayList<Observer> Obs;

    public VisaOffice() {
        visa = new ArrayList();
        Obs = new ArrayList();
    }

    public void AddVisa(Visa v) {
        visa.add(v);
        Notify();
    }

    public ArrayList<Visa> getStatus() {
        return visa;
    }

    public void Attach(Observer o) {
        Obs.add(o);
    }

    public void Dettach(Observer o) {
        Obs.remove(o);
    }

    public void Notify() {
        for (int i = 0; i < Obs.size(); i++) {
            Obs.get(i).update(this);
        }
    }

    @Override
    public void VisaType() {
        System.out.print("Visa Status ---> ");
    }
}