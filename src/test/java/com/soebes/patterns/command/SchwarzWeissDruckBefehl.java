package com.soebes.patterns.command;

import java.io.File;

public class SchwarzWeissDruckBefehl implements IDruckBefehl {

    private SchwarzWeissDrucker schwarzWeissDrucker;
    
    @Override
    public boolean ausführen(File document) {
        schwarzWeissDrucker.konfigurieren();
        schwarzWeissDrucker.mehrKonfigurieren();

        return schwarzWeissDrucker.drucken(document);
    }

    public SchwarzWeissDrucker getSchwarzWeissDrucker() {
        return schwarzWeissDrucker;
    }

    public void setSchwarzWeissDrucker(SchwarzWeissDrucker schwarzWeissDrucker) {
        this.schwarzWeissDrucker = schwarzWeissDrucker;
    }

}
