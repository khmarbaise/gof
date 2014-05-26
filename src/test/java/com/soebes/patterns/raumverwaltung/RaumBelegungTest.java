package com.soebes.patterns.raumverwaltung;

import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

@Test
public class RaumBelegungTest extends TestBase {

    public void nichtVerfuegbarTest() throws BelegungsZeitraumEndeVorAnfangException, BelegungsZeitraumAnfangGleichEndeException {
        RaumBelegung rb = new RaumBelegung(new Raum("Raum 1"));
        BelegungsZeitraum zeitraum1 = new BelegungsZeitraum(parseDate("01.01.2009 12:00:00"), parseDate("01.01.2009 15:00:00"));
        rb.addBelegung(zeitraum1);

        BelegungsZeitraum zeitraum2 = new BelegungsZeitraum(parseDate("01.01.2009 12:00:00"), parseDate("01.01.2009 15:00:00"));

        assertThat(rb.isVerfuegbar(zeitraum2)).isFalse();
    }

    public void isVerfuegbarTest() throws BelegungsZeitraumEndeVorAnfangException, BelegungsZeitraumAnfangGleichEndeException {

        RaumBelegung rb = new RaumBelegung(new Raum("Raum 1"));
        BelegungsZeitraum zeitraum1 = new BelegungsZeitraum(parseDate("01.01.2009 12:00:00"), parseDate("01.01.2009 15:00:00"));
        rb.addBelegung(zeitraum1);

        BelegungsZeitraum zeitraum2 = new BelegungsZeitraum(parseDate("01.01.2009 16:00:00"), parseDate("01.01.2009 17:00:00"));

        assertThat(rb.isVerfuegbar(zeitraum2)).isTrue();
    }

    public void verfuegbarMehrereZeitraeumeTest() throws BelegungsZeitraumEndeVorAnfangException,
            BelegungsZeitraumAnfangGleichEndeException {
        RaumBelegung rb = new RaumBelegung(new Raum("Raum 1"));
        BelegungsZeitraum zeitraum = new BelegungsZeitraum(parseDate("01.01.2009 12:00:00"), parseDate("01.01.2009 15:00:00"));
        rb.addBelegung(zeitraum);

        zeitraum = new BelegungsZeitraum(parseDate("01.01.2009 16:00:00"), parseDate("01.01.2009 17:00:00"));
        rb.addBelegung(zeitraum);

        zeitraum = new BelegungsZeitraum(parseDate("01.01.2009 15:00:00"), parseDate("01.01.2009 15:09:59"));
        rb.addBelegung(zeitraum);

        BelegungsZeitraum buchungsZeit = new BelegungsZeitraum(parseDate("01.01.2009 15:10:00"), parseDate("01.01.2009 15:30:00"));

        assertThat(rb.isVerfuegbar(buchungsZeit)).isTrue();
    }

    public void verfuegbarMehrereZeitraeumeIntersectTest() throws BelegungsZeitraumEndeVorAnfangException,
            BelegungsZeitraumAnfangGleichEndeException {
        RaumBelegung rb = new RaumBelegung(new Raum("Raum 1"));
        BelegungsZeitraum zeitraum = new BelegungsZeitraum(parseDate("01.01.2009 12:00:00"), parseDate("01.01.2009 14:30:00"));
        rb.addBelegung(zeitraum);

        zeitraum = new BelegungsZeitraum(parseDate("01.01.2009 15:00:00"), parseDate("01.01.2009 15:09:59"));
        rb.addBelegung(zeitraum);

        zeitraum = new BelegungsZeitraum(parseDate("01.01.2009 16:00:00"), parseDate("01.01.2009 17:00:00"));
        rb.addBelegung(zeitraum);

        BelegungsZeitraum buchungsZeit = new BelegungsZeitraum(parseDate("01.01.2009 14:45:00"), parseDate("01.01.2009 14:55:00"));

        assertThat(rb.isVerfuegbar(buchungsZeit)).isTrue();
    }

}
