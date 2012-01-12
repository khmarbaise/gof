package com.soebes.patterns.command;

import java.io.File;

public interface IDruckBefehl {

    boolean ausführen(File document);
}
