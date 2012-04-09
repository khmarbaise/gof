package com.soebes.patterns.raumverwaltung;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class BelegungsZeitraumTest extends TestBase {

    public void instanzBildungsTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	BelegungsZeitraum bz = new BelegungsZeitraum(
		parseDate("01.01.2009 12:00:00"),
		parseDate("01.01.2009 15:00:00"));
	Assert.assertNotNull(bz);
    }

    @Test(expectedExceptions = { BelegungsZeitraumEndeVorAnfangException.class })
    public void endeVorAnfangExceptionTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	@SuppressWarnings("unused")
	BelegungsZeitraum bz = new BelegungsZeitraum(
		parseDate("01.01.2009 16:00:00"),
		parseDate("01.01.2009 15:00:00"));
    }

    @Test(expectedExceptions = { BelegungsZeitraumAnfangGleichEndeException.class })
    public void anfangIstGleichEndeExceptionTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	@SuppressWarnings("unused")
	BelegungsZeitraum bz = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 15:00:00"));
    }

    public void compareToZeroTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	BelegungsZeitraum bz1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum bz2 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	Assert.assertEquals(bz1.compareTo(bz2), 0);
    }

    public void compareToNegativeAnfangTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	BelegungsZeitraum bz1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum bz2 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:01:00"),
		parseDate("01.01.2009 16:00:00"));

	int result = bz1.compareTo(bz2);
	Assert.assertEquals(result < 0, true);
    }

    public void compareToPositiveAnfangTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	BelegungsZeitraum bz1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:01:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum bz2 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));

	int result = bz1.compareTo(bz2);
	Assert.assertEquals(result > 0, true);
    }

    public void compareToNegativeEndeTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	BelegungsZeitraum bz1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum bz2 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:01:00"));

	int result = bz1.compareTo(bz2);
	Assert.assertEquals(result < 0, true);
    }

    public void compareToPositiveEndTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	BelegungsZeitraum bz1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:01:00"));
	BelegungsZeitraum bz2 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));

	int result = bz1.compareTo(bz2);
	Assert.assertEquals(result > 0, true);
    }

    public void containsZ2beforeZ1Test()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	// Anfang Ende
	// +----------+ (z1)
	//
	// A E
	// +--------+ (z2)
	BelegungsZeitraum z1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum z2 = new BelegungsZeitraum(
		parseDate("01.01.2009 14:00:00"),
		parseDate("01.01.2009 14:30:00"));

	boolean result = z1.contains(z2);
	Assert.assertEquals(result, false);
    }

    public void containsZ2BeforeZ1IntersectTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	// Anfang Ende
	// +----------+ (z1)
	// 15:00 16:00
	// A E
	// +--------+ (z2)
	// 14:30 15:30
	BelegungsZeitraum z1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum z2 = new BelegungsZeitraum(
		parseDate("01.01.2009 14:30:00"),
		parseDate("01.01.2009 15:30:00"));

	boolean result = z1.contains(z2);
	Assert.assertEquals(result, true);
    }

    public void containsZ2IntersectsZ1Test()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	// Anfang Ende
	// +----------+ (z1)
	// 15:00 16:00
	// A E
	// +--------+ (z2)
	BelegungsZeitraum z1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum z2 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:01"),
		parseDate("01.01.2009 15:59:59"));

	boolean result = z1.contains(z2);
	Assert.assertEquals(result, true);
    }

    public void containsZ2AfterZ1IntersectTest()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	// Anfang Ende
	// +----------+ (z1)
	// 15:00 16:00
	// A E
	// +--------+ (z2)
	BelegungsZeitraum z1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum z2 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:30:00"),
		parseDate("01.01.2009 16:30:00"));

	boolean result = z1.contains(z2);
	Assert.assertEquals(result, true);
    }

    public void containsZ2AfterZ1Test()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	// Anfang Ende
	// +----------+ (z1)
	// 15:00 16:00
	// A E
	// +--------+ (z2)
	BelegungsZeitraum z1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum z2 = new BelegungsZeitraum(
		parseDate("01.01.2009 16:00:01"),
		parseDate("01.01.2009 16:30:00"));

	boolean result = z1.contains(z2);
	Assert.assertEquals(result, false);
    }

    public void containsZ2EqualsZ1Test()
	    throws BelegungsZeitraumEndeVorAnfangException,
	    BelegungsZeitraumAnfangGleichEndeException {
	// Anfang Ende
	// +----------+ (z1)
	// 15:00 16:00
	// A E
	// +----------+ (z2)
	BelegungsZeitraum z1 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));
	BelegungsZeitraum z2 = new BelegungsZeitraum(
		parseDate("01.01.2009 15:00:00"),
		parseDate("01.01.2009 16:00:00"));

	boolean result = z1.contains(z2);
	Assert.assertEquals(result, true);
    }

}
