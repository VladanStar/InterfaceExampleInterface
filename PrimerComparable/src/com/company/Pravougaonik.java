package com.company;

public class Pravougaonik implements Comparable,Printable, GeomterijskiOblik{
    private double a, b;

    public Pravougaonik() {
    }

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Pravougaonik{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public double povrsinaPravougaonika() {
        return a * b;
    }

    public double obimPravougaonika() {
        return 2 * a + 2 * b;
    }

    @Override
    public int compareTo(Object o) {
        Pravougaonik drugi = (Pravougaonik) o;
        if (this.povrsinaPravougaonika() > ((Pravougaonik) o).povrsinaPravougaonika()) {
            return 1;
        }
        if (this.povrsinaPravougaonika() < ((Pravougaonik) o).povrsinaPravougaonika()) {
            return -1;
        }
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Pravougaonik{" +
                "a=" + a +
                ", b=" + b +
                '}');
    }

    @Override
    public double izracunaObim() {
        return 2*a + 2*b;
    }

    @Override
    public double izracunaPovrsinu() {
        return a*b;
    }
}
