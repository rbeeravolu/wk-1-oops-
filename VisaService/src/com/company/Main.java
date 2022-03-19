package com.company;

public class Main {

    public static void main(String[] args) {
        VisaOffice vi = new VisaOffice();
        Person jack = new Person("Jack");
        Person lenin = new Person("lenin");
        Person jenifer = new Person("jenifer");
        Visa v = new Visa("Jack","jenifer","Hello..You got Visa");

        vi.Attach(jack);
        vi.Attach(lenin);
        vi.Attach(jenifer);

        vi.AddVisa(v);
		Item F1Visa = new F1Visa(vi);
		F1Visa.VisaType();


        Item H1bVisa = new H1bVisa(vi);
        H1bVisa.VisaType();
    }
}
