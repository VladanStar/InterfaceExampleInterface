package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pravougaonik[] pravougaoniks = new Pravougaonik[3];
        pravougaoniks[0] = new Pravougaonik(2,4);
        pravougaoniks[1] = new Pravougaonik(3,1);
        pravougaoniks[2] = new Pravougaonik(3,3);

        for (Pravougaonik p: pravougaoniks
             ) {
            System.out.println(p);

        }
        Arrays.sort(pravougaoniks);
        System.out.println("Sortirani niz pravougaonika prema povrsini");
        for (Pravougaonik p: pravougaoniks
        ) {
            System.out.println(p);

        }
        System.out.println("Primena naseg interfejsa");
        Printable e = new Pravougaonik(4,2);
        e.print();

        System.out.println("Primer krug");

        List<GeomterijskiOblik> oblik = new ArrayList<>();
        oblik.add(new Krug(4));
        oblik.add(new Pravougaonik(2,5));
        oblik.add(new Pravougaonik(1,5));
        oblik.add(new Krug(5));
        oblik.add(new Kvadrat(3));

        System.out.println("Lista geometrijskih oblika");
        for (GeomterijskiOblik oblici : oblik
             ) {
            if(oblici instanceof Printable){
                ((Printable) oblici).print();
            }
            else{
                System.out.println("Objekat nije Printable interfejs");
                System.out.println(oblici.toString());
            }
            System.out.println(oblici);
            System.out.println(" Obim" + oblici.izracunaObim());
            System.out.println("Povrsina " + oblici.izracunaPovrsinu());

        }

    }
}
