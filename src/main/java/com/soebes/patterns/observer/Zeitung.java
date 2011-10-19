package com.soebes.patterns.observer;

public class Zeitung {

    // Ein examplarisches Field.
    private final String titel;

    public Zeitung(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }
}