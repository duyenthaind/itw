package com.sample.itw.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SampleThread {
    private static final Logger LOGGER = Logger.getLogger("SampleThread");

    public static void main(String[] args) {
        Thread thread = new Thread("sample thread") {
            @Override
            public void run() {
                try {
                    TimeUnit.MILLISECONDS.sleep(300);
                } catch (Exception ex) {
                    LOGGER.log(Level.SEVERE, "Error", ex);
                }
                System.out.printf("I am %s and i am independent from main thread%n", Thread.currentThread().getName());
            }
        };
        thread.start();
        System.out.println("I am main thread");
    }
}
