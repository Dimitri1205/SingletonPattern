package com.company;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

      //  PrinterSpooler printerSpooler = new PrinterSpooler();

        PrinterSpooler printerSpooler = PrinterSpooler.getInstance();

        Thread thread1 = new Thread(() -> {PrinterSpooler spooler = PrinterSpooler.getInstance();});
        Thread thread2 = new Thread(() -> {PrinterSpooler spooler = PrinterSpooler.getInstance();});

        Thread thread3 = new Thread(() -> { EagerPrinterSpooler eagerSpooler = EagerPrinterSpooler.getInstance(); });
        Thread thread4 = new Thread(() -> { EagerPrinterSpooler eagerSpooler = EagerPrinterSpooler.getInstance(); });


        thread1.start();
        thread2.start();

        thread3.start();
        thread4.start();


//SingletonList from Collections class
        ObjectForSingletonList objectForSingletonList1 = new ObjectForSingletonList();

        List<ObjectForSingletonList> list = Collections.singletonList(objectForSingletonList1);

        /* This will give UnsupportedOperationException
        ObjectForSingletonList objectForSingletonList2 = new ObjectForSingletonList();
        list.add(objectForSingletonList2);
        */
    }

    public static <T> void processObject (List<T> list) {
        for (T o: list) {
            //code to process resource
        }
    }

}
