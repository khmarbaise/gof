package com.soebes.patterns.raumverwaltung;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBase {

    /**
     * This method will convert a date which is defined as string (Format: dd.MM.yyyy HH:mm:ss Z) 
     * into Date type.
     * @param dateStr The string which represents a Date.
     * @return Date
     * @throws ParseException
     */
    public static Date parseDate(String dateStr) {
        Date d = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            d = (Date)formatter.parse(dateStr);
        } catch (ParseException e) {
            System.err.println("Date format is wrong: " + e.getMessage());
        }
        return d;
    }
}
