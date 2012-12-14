package com.soebes.patterns.state2;

class Freundin {

  private IZustand zustand;

  public IZustand getZustand() {
    return zustand;
  }

  public Freundin(IZustand zustand) {
    super();
    this.zustand = zustand;
  }

  public Freundin() {
    this.zustand = new Neutral(this);
  }

  public void setZustand(IZustand zustand) {
    this.zustand = zustand;
  }

}