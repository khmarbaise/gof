package com.soebes.patterns.raumverwaltung;

import org.testng.annotations.Test;

@Test
public class ResourcesTest extends TestBase {

    public void resourceTest() throws Exception {
	Raum raum = new Raum("Raum 1");
	RaumBelegung rb = new RaumBelegung(raum);

	BelegungsZeitraum zeitraum = new BelegungsZeitraum(
		parseDate("01.01.2009 12:00:00"),
		parseDate("01.01.2009 15:00:00"));
	rb.addBelegung(zeitraum);

	// if (rb.isVerfuegbar(zeitraum)) {
	// //rb.addBelegung ();
	// } else {
	// //Raum ist in dem Zeitraum nich mehr verf�gbar.
	// }
    }
}
