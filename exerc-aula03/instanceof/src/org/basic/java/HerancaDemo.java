package org.basic.java;

public  class HerancaDemo {
    public static void main(String[] args) {
        /*
        Pai p = new Pai();

        Filho f = new Filho();

        if (p instanceof Pai) {
            System.out.println("p instanceof Pai");
        }
        if (p instanceof Filho) {
            System.out.println("p instanceof Filho");
        }
        if (f instanceof Pai) {
            System.out.println("f instanceof Pai");
        }
        if (f instanceof Filho) {
            System.out.println("f instanceof Filho");
        }
        */

        Pai p = new Pai();
        p = new Filho();

        Filho f = new Filho();

        if (p instanceof Pai) {
            System.out.println("p instanceof Pai");
        }
        if (p instanceof Filho) {
            System.out.println("p instanceof Filho");
        }
        if (f instanceof Pai) {
            System.out.println("f instanceof Pai");
        }
        if (f instanceof Filho) {
            System.out.println("f instanceof Filho");
        }


    }
}