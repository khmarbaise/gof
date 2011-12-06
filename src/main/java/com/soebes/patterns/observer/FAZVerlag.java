package com.soebes.patterns.observer;

public class FAZVerlag extends AVerlag {

    private Zeitung aktuelleZeitung;

    public void setAktuelleZeitung(Zeitung aktuelleZeitung) {
        this.aktuelleZeitung = aktuelleZeitung;
        // Nach dem einen neue Zeitung gesetzt wurde, werden alle Abonnenten benachrichtigt.
        verteileZeitung(aktuelleZeitung);
    }

    public Zeitung getAktuelleZeitung() {
        return aktuelleZeitung;
    }
}