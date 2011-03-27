package com.soebes.patterns.raumverwaltung;

public class BelegungsZeitraumEndeVorAnfangException extends Exception {

	private static final long serialVersionUID = 1L;

	public BelegungsZeitraumEndeVorAnfangException() {
		super();
	}
	
	public BelegungsZeitraumEndeVorAnfangException(String msg) {
		super(msg);
	}
}
