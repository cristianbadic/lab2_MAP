package com.company;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

class BenutzerTest {

    //Methode um die gesamt Sportzeit eines Benutzers zu testen
    @org.junit.jupiter.api.Test
    void kalkuliereZeit() {
        Sport basketball1 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport hindernisslauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        Sport basketball2 = new Basketball();
        Sport fussball2 = new Fussball();
        Sport fussball3 = new Fussball();

        Benutzer ben1 = new Benutzer("Ion", "Ionel", Arrays.asList(fussball1, fussball2, hochsprung));
        Benutzer ben2 = new Benutzer("Dan", "Danut", Arrays.asList(fussball1, fussball2, fussball3, hindernisslauf, hochsprung, basketball1, basketball2));
        Benutzer ben3 = new Benutzer("Ion", "Ionel", new ArrayList<>());

        //basket == 55, fussball = 65, hindernisslauf = 30, hochsprung = 20
        Assertions.assertEquals(150, ben1.kalkuliereZeit());
        Assertions.assertEquals(355, ben2.kalkuliereZeit());
        Assertions.assertEquals(0, ben3.kalkuliereZeit());
    }

    //Methode um zu bestimmen, wie viel Zeit ein Benutzer fur eine bestimmten Sportart braucht
    @org.junit.jupiter.api.Test
    void testKalkuliereZeit() {
        Sport basketball1 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport hindernisslauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        Sport basketball2 = new Basketball();
        Sport fussball2 = new Fussball();
        Sport fussball3 = new Fussball();

        Benutzer ben1 = new Benutzer("Ion", "Ionel", Arrays.asList(fussball1, fussball2, hochsprung));
        Benutzer ben2 = new Benutzer("Dan", "Danut", Arrays.asList(fussball1, fussball2, fussball3, hindernisslauf, hochsprung, basketball1, basketball2));
        Benutzer ben3 = new Benutzer("Ion", "Ionel", new ArrayList<>());

        //basket == 55, fussball = 65, hindernisslauf = 30, hochsprung = 20

        try{
            Assertions.assertEquals(65, ben1.kalkuliereZeit(fussball1));
        }catch (Exception exception){
            Assertions.fail();
        }
        try{
            Assertions.assertEquals(20, ben2.kalkuliereZeit(hochsprung));
        }catch (Exception exception){
            Assertions.fail();
        }
        try{
            ben3.kalkuliereZeit(fussball2);
            Assertions.fail();
        }catch (Exception exception){
            Assertions.assertTrue(true);
        }

    }

    //Methode, welche den Durchschnittszeit um Sport treiben, eines Benutzes testet
    @org.junit.jupiter.api.Test
    void kalkuliereDurchschnittszeit() {
        Sport basketball1 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport hindernisslauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        Sport basketball2 = new Basketball();
        Sport fussball2 = new Fussball();
        Sport fussball3 = new Fussball();

        Benutzer ben1 = new Benutzer("Ion", "Ionel", Arrays.asList(fussball1, fussball2, hochsprung));
        Benutzer ben2 = new Benutzer("Dan", "Danut", Arrays.asList(fussball1, fussball2, fussball3, hindernisslauf, hochsprung, basketball1, basketball2));
        Benutzer ben3 = new Benutzer("Ion", "Ionel", new ArrayList<>());

        //basket == 55, fussball = 65, hindernisslauf = 30, hochsprung = 20

        try{
            Assertions.assertEquals((double)150/3, ben1.kalkuliereDurchschnittszeit());
        }catch (Exception exception){
            Assertions.fail();
        }
        try{
            Assertions.assertEquals((double)355/7, ben2.kalkuliereDurchschnittszeit());
        }catch (Exception exception){
            Assertions.fail();
        }
        try{
            ben3.kalkuliereDurchschnittszeit();
            Assertions.fail();
        }catch (Exception exception){
            Assertions.assertTrue(true);
        }
    }
}