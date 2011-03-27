package com.soebes.patterns.raumverwaltung;

import java.util.Date;

public class BelegungsZeitraum implements Comparable<BelegungsZeitraum> {

    private Date anfangBelegung;
    private Date endeBelegung;

    public BelegungsZeitraum(Date anfangBelegung, Date endeBelegung)
            throws BelegungsZeitraumEndeVorAnfangException,
            BelegungsZeitraumAnfangGleichEndeException {
        if (endeBelegung.before(anfangBelegung)) {
            throw new BelegungsZeitraumEndeVorAnfangException(
                    "Das Ende der Belegung liegt vor dem Anfang der Belegung");
        }
        if (anfangBelegung.equals(endeBelegung)) {
            throw new BelegungsZeitraumAnfangGleichEndeException(
                    "Anfang und Ende sind gleich!");
        }

        this.anfangBelegung = anfangBelegung;
        this.endeBelegung = endeBelegung;
    }

    public void setAnfangBelegung(Date anfangBelegung) {
        this.anfangBelegung = anfangBelegung;
    }

    public Date getAnfangBelegung() {
        return anfangBelegung;
    }

    public void setEndeBelegung(Date endeBelegung) {
        this.endeBelegung = endeBelegung;
    }

    public Date getEndeBelegung() {
        return endeBelegung;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((anfangBelegung == null) ? 0 : anfangBelegung.hashCode());
        result = prime * result
                + ((endeBelegung == null) ? 0 : endeBelegung.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelegungsZeitraum other = (BelegungsZeitraum) obj;
        if (anfangBelegung == null) {
            if (other.anfangBelegung != null)
                return false;
        } else if (!anfangBelegung.equals(other.anfangBelegung))
            return false;
        if (endeBelegung == null) {
            if (other.endeBelegung != null)
                return false;
        } else if (!endeBelegung.equals(other.endeBelegung))
            return false;
        return true;
    }

    @Override
    public int compareTo(BelegungsZeitraum o) {
        if (this.getAnfangBelegung().compareTo(o.getAnfangBelegung()) == 0) {
            return this.getEndeBelegung().compareTo(o.getEndeBelegung());
        } else {
            return this.getAnfangBelegung().compareTo(o.getAnfangBelegung());
        }
    }

    /**
     * This method will check if the given time frame is part of the current
     * object. It will result true if one of the following cases occur:
     * <ul>
     * <li>
     * 
     * <pre>
     *           Anfang    Ende
     *           +---------+ (this)
     * 
     *                 A       E
     *                +-------+
     * </pre>
     * 
     * </li>
     * <li>
     * 
     * <pre>
     *           Anfang    Ende
     *           +---------+ (this)
     * 
     *           A         E
     *           +---------+
     * </pre>
     * 
     * </li>
     * <li>
     * 
     * <pre>
     *           Anfang    Ende
     *           +---------+ (this)
     * 
     *     A       E
     *     +-------+
     * </pre>
     * 
     * </li>
     * </ul>
     * 
     * @param zeitraum
     *            The timeframe which will be checked.
     * @return true if it is contained false otherwise
     */
    public boolean contains(BelegungsZeitraum zeitraum) {
        boolean result = false;

        // Anfang Ende
        // +----------+ (this)
        //
        // A E
        // +--------+
        // No need to code, cause it's automatically false.

        // Anfang Ende
        // +----------+ (this)
        //
        // A E
        // +--------+
        if (this.getAnfangBelegung().before(zeitraum.getAnfangBelegung())) {
            if (this.getEndeBelegung().after(zeitraum.getAnfangBelegung())) {
                result = true;
            }
        }

        // Anfang Ende
        // +----------+ (this)
        //
        // A E
        // +--------+
        if (this.getAnfangBelegung().after(zeitraum.getAnfangBelegung())
                || this.getAnfangBelegung()
                        .equals(zeitraum.getAnfangBelegung())) {
            if (this.getEndeBelegung().before(zeitraum.getEndeBelegung())
                    || this.getEndeBelegung()
                            .equals(zeitraum.getEndeBelegung())) {
                // Liegt drin
                result = true;
            }
        }

        // Anfang Ende
        // +----------+ (this)
        //
        // A E
        // +--------+
        if (zeitraum.getAnfangBelegung().before(this.getAnfangBelegung())) {
            if (this.getAnfangBelegung().before(zeitraum.getEndeBelegung())) {
                result = true;
            }
        }

        // Anfang Ende
        // +----------+ (this)
        //
        // A E
        // +--------+
        // No need to code, cause automatically false.

        return result;
    }

}
