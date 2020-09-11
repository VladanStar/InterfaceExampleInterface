package com.company;

public class Krug implements GeomterijskiOblik, Comparable,Printable {
    private double r;

    public Krug() {
    }

    public Krug(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Krug{" +
                "r=" + r +
                '}';
    }

    @Override
    public double izracunaObim() {
        return 2*r*Math.PI;
    }

    @Override
    public double izracunaPovrsinu() {
        return r*r*Math.PI;
    }

    @Override
    public void print() {
        System.out.println("Krug{" +
                "r=" + r +
                '}');
    }

    @Override
    public int compareTo(Object o) {
        Krug drugi = (Krug) o;
        if(this.izracunaPovrsinu() > ((Krug) o).izracunaPovrsinu()){
            return 1;
        }
        if(this.izracunaPovrsinu() > ((Krug) o).izracunaPovrsinu()){
            return -1;
        }
        return 0;
    }
}
