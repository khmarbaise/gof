package com.soebes.patterns.state2;

class Neutral extends AZustand {

    public Neutral(Freundin freundin) {
        super(freundin);
    }

    public void unterhalten() {
        // 10 % Wahrscheinlichkeit => Bockig...
        // Bedinung
        System.out.println("Fününününü.");
    }

    public void kussGeben() {
        System.out.println("Hihi :-)");
        getFreundin().setAktuellerZustand(new Froehlich(getFreundin())); // Zustandsübergang
    }

    public void verärgern() {
        System.out.println("Du spinnst wohl! Ich bin sauer! ;-(");
        getFreundin().setAktuellerZustand(new Bockig(getFreundin())); // Zustandsübergang
    }
}