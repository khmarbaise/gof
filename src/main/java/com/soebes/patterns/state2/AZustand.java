package com.soebes.patterns.state2;

public abstract class AZustand implements IZustand {
	
	private Freundin freundin;
	
	public AZustand(Freundin freundin) {
		super();
		this.freundin = freundin;
	}

	public Freundin getFreundin() {
		return freundin;
	}

	public void setFreundin(Freundin freundin) {
		this.freundin = freundin;
	}
	
}
