package com.company;

public class Kvadrat implements GeomterijskiOblik{
    private  double a;

    public Kvadrat() {
    }

    public Kvadrat(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "a=" + a +
                '}';
    }

    @Override
    public double izracunaObim() {
        return 4*a;
    }

    @Override
    public double izracunaPovrsinu() {
        return a*a;
    }
}
