package com.company;

public class EagerPrinterSpooler {

    //object is created when the class is loaded, uses more memory,

    private static final EagerPrinterSpooler spooler = new EagerPrinterSpooler();
    private static boolean initialized = false;

    private EagerPrinterSpooler() { }

    private void initialize () {
        //code for initializing the object
    }

    //still needs the check and synchronized so the initialize() doesnt get called twice
    public static synchronized EagerPrinterSpooler getInstance() {
        if(initialized) return spooler;
        spooler.initialize();
        initialized = true;
        return spooler;
    }

}
