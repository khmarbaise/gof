package com.soebes.patterns.state2;

class Froehlich extends AZustand {

    public Froehlich(Freundin freundin) {
        super(freundin);
    }

    public void unterhalten() {
        System.out.println("Hihi, Fünüüüüüüünü!");
    }

    public void kussGeben() {
        System.out.println("Hihi, :-D");
    }

    public void verärgern() {
        System.out.println("Du spinnst wohl! ;-(");
        getFreundin().setZustand(new Bockig(getFreundin())); // Zustandsübergang
    }
}