package com.soebes.patterns.raumverwaltung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RaumBelegung {

    private Raum raum;

    private ArrayList<BelegungsZeitraum> belegungen = new ArrayList<BelegungsZeitraum>();

    public RaumBelegung(Raum raum) {
        this.raum = raum;
    }

    public void setRaum(Raum raum) {
        this.raum = raum;
    }

    public Raum getRaum() {
        return raum;
    }

    public ArrayList<BelegungsZeitraum> getBelegungen() {
        return belegungen;
    }

    public void addBelegung(BelegungsZeitraum range) {
        getBelegungen().add(range);
    }

    public boolean isVerfuegbar(BelegungsZeitraum zeitraum2) {
        Collections.sort(belegungen);
        boolean result = true;
        for (BelegungsZeitraum item : getBelegungen()) {
            if (item.contains(zeitraum2)) {
                result = false;
            }
        }
        return result;
    }
}
