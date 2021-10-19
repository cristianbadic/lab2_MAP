package com.company;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    //Constructor
    public Benutzer(String vorName, String nachName, List<Sport> sport){
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    //Getters und Setters fur alle Attribute
    public List<Sport> getSport() {
        return sport;
    }

    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }


    //kalkuliert die Dauer einer Sportart, sonst wenn die Sportart nicht in der Liste sport vorkommt, wird ein Exception ausgelost
    public double kalkuliereZeit(Sport sportart) throws Exception{
        for (Sport lieblings : sport) {
            if (lieblings == sportart) {
                return sportart.kalkuliereZeit();
            }
        }
        throw new Exception("Diese Sportart wird nicht getrieben!");
    }

    //kalkuliert die Gesamtzeit fur die Treibung aller Sportarten
    public double kalkuliereZeit(){
        double gesammtZeit = 0;
        for (Sport lieblings : sport) {
            gesammtZeit += lieblings.kalkuliereZeit();
        }
        return gesammtZeit;
    }

    //kalkuliert die Durchschnittszeit fur die Treibung aller Sportarten, wenn aber die Liste leer ist, wird ein Exception ausgelost
    public double kalkuliereDurchschnittszeit() throws Exception{
        double summe = this.kalkuliereZeit();
        if (sport.size() == 0){
            throw new Exception("Der Benutzer hat keine Lieblingssporte!");
        }
        return (summe / sport.size());
    }
}
