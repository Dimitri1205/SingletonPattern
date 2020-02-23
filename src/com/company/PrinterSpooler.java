package com.company;

public class PrinterSpooler {

    private static PrinterSpooler spooler;
    private static boolean initialized = false;

    private PrinterSpooler() { }

    private void initialize () {
        //code for initializing the object
    }

    //Lazy initialization. not creating an object until is needed (called)
    public static synchronized PrinterSpooler getInstance() {
        if(initialized) return spooler;
        spooler = new PrinterSpooler();
        spooler.initialize();
        initialized = true;
        return spooler;
    }
}
