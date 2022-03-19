package com.company;

import java.util.ArrayList;

public class Person implements Observer{

    String name;

    public Person(String name) {
        this.name = name;
    }

    public void checkVisa(ArrayList<Visa> Visa) {
        for(int i=0; i<Visa.size();i++) {
            if(name.compareTo(Visa.get(i).receiverName) == 0) {
                System.out.println(name+","+Visa.get(i).info);
            }
        }
    }

    public void update(Object o) {
        if(o instanceof VisaOffice) {
            VisaOffice v = (VisaOffice) o;
            checkVisa(v.getStatus());
        }
    }
}