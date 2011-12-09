package com.soebes.patterns.command;

import java.io.File;

public class SchwarzWeissDrucker {

    public SchwarzWeissDrucker() {

    }
    
    public void konfigurieren() {
        //
    }
    public void mehrKonfigurieren() {
        
    }

    public boolean drucken(File document) {
        System.out.println("Drucke Dokument:" + document.getName());
        return true;
    }
}
