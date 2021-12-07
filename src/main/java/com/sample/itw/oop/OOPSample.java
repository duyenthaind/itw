package com.sample.itw.oop;

public class OOPSample {
    public static void main(String[] args) {
        Implementation im = new Implementation();
        im.createIndex();
        im.index();
        im.index(2);
        im.index2();
        System.out.println("Get from this object, " + im.getOfMine());
    }
}

interface PolyMorphism {
    void index();
}

abstract class Abstraction {
    protected int total = 1;

    public abstract void index2();

    void createIndex() {
        System.out.println("Creating index");
    }
}

//abstraction
//polyMorphism
class Implementation extends Abstraction implements PolyMorphism {

    private int ofMine = 5;

    @Override
    public void index() {
        System.out.println("Indexing");
    }

    @Override
    public void index2() {
        System.out.println("indexing 2");
    }

    // overload
    public void index(int a) {
        System.out.printf("Indexing %s records %n", a);
        // inheritance
        System.out.println("From super class " + total);
    }

    // encapsulation
    public int getOfMine() {
        return ofMine;
    }

    public void setOfMine(int ofMine) {
        this.ofMine = ofMine;
    }
}
