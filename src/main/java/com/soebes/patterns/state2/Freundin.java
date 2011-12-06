package com.soebes.patterns.state2;

class Freundin {

    private IZustand aktuellerZustand;

    public IZustand getAktuellerZustand() {
        return aktuellerZustand;
    }

    public Freundin(IZustand aktuellerZustand) {
        super();
        this.aktuellerZustand = aktuellerZustand;
    }

    public Freundin() {
        this.aktuellerZustand = new Neutral(this);
    }

    public void setAktuellerZustand(IZustand aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }

    public void unterhalten() {
        aktuellerZustand.unterhalten();
    }

    public void kussGeben() {
        aktuellerZustand.kussGeben();
    }

    public void verärgern() {
        aktuellerZustand.verärgern();
    }
}