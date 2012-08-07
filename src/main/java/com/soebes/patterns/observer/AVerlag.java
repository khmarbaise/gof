package com.soebes.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AVerlag {

  private List<IAbonnent> abonnentenList = new ArrayList<IAbonnent>();

  public void aboHinzufuegen(IAbonnent abonnent) {
    abonnentenList.add(abonnent);
  }

  public void aboEntfernen(IAbonnent abonnent) {
    abonnentenList.remove(abonnent);
  }

  protected void verteileZeitung(Zeitung zeitung) {
    for (IAbonnent abonnent : abonnentenList) {
      abonnent.erhalteZeitung(zeitung);
    }
  }
}