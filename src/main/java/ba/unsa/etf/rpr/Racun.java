package ba.unsa.etf.rpr;
import java.lang.Math;

public class Racun {
    private int broj;

    public Racun(int broj) {
        this.broj = broj;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public double sinus(int broj){
        double a=Math.toRadians(broj);
        return Math.sin(a);
    }

    public int faktorijel(int broj){
        int i;
        int fact=1;
        for(i=1;i<=broj;i++){
            fact=fact*i;
        }
        return fact;
    }

}
