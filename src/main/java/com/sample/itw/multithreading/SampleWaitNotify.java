package com.sample.itw.multithreading;

public class SampleWaitNotify {

    public static void main(String[] args) {
        Thread sample = new ThreadSample();
        sample.start();

        synchronized (sample) {
            try {
                System.out.println("Waiting for the class to complete");
                sample.wait();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("All job is done");
        }
    }
}

class ThreadSample extends Thread {

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Ok it is ok now, i have done my job");
            notify();
        }
    }
}