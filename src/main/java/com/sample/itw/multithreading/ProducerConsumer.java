package com.sample.itw.multithreading;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProducerConsumer {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.start();
        new Consumer(producer).start();
    }
}

class Producer extends Thread {

    static final int MAXQUEUE = 5;
    private List<String> messages = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        try {
            while (true) {
                putMessage();
//                sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void putMessage() throws InterruptedException {
        while (messages.size() == MAXQUEUE) {
            wait();
        }
        messages.add(new java.util.Date().toString());
        System.out.println("put message");
        notify();
    }

    public synchronized String getMessage() throws InterruptedException {
        notify();
        while (messages.isEmpty()) {
            System.out.println("Waiting producer publish more message");
            wait();
        }
        String message = messages.get(0);
        messages.remove(message);
        return message;
    }
}

class Consumer extends Thread {

    Producer producer;

    Consumer(Producer p) {
        producer = p;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = producer.getMessage();
                System.out.println("Got message: " + message);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
