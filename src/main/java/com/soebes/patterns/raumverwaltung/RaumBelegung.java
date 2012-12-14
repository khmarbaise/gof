package com.soebes.patterns.raumverwaltung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RaumBelegung {

  private Raum raum;

<<<<<<< HEAD
    private List<BelegungsZeitraum> belegungen = new ArrayList<BelegungsZeitraum>();
=======
  private ArrayList<BelegungsZeitraum> belegungen = new ArrayList<BelegungsZeitraum>();
>>>>>>> c1951253c7e434d9747eb8577c6aed37304c9261

  public RaumBelegung(Raum raum) {
    this.raum = raum;
  }

  public void setRaum(Raum raum) {
    this.raum = raum;
  }

  public Raum getRaum() {
    return raum;
  }

<<<<<<< HEAD
    public List<BelegungsZeitraum> getBelegungen() {
        return belegungen;
    }
=======
  public ArrayList<BelegungsZeitraum> getBelegungen() {
    return belegungen;
  }
>>>>>>> c1951253c7e434d9747eb8577c6aed37304c9261

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
