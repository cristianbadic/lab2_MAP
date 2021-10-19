package com.company;

public class Fussball extends Mannschaftssport{

    //Uberschreibt die Methode aus der abstrakten Klasse Mannschaftssport, kalkuliert die Zeit die man zum Fussball braucht
    @Override
    public double kalkuliereZeit(){
        return 65;
    }
}
