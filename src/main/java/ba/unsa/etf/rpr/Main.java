package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite broj");
        int a=Integer.parseInt(args[0]);

        Racun b=new Racun(a);

        System.out.println("Rezultat sinusa je: "+b.sinus(a)+" a rezultat faktorijela je: "+b.faktorijel(a));

    }
}
