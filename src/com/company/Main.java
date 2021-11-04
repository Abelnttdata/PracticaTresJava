package com.company;

public class Main {

    public static void main(String[] args) {

        PrintMe insUno = new PrintMe();
        PrintMe insDos = new PrintMe();
        PrintMe insTres = new PrintMe();

        Thread hilo1 = new Thread(insUno);
        Thread hilo2 = new Thread(insDos);
        Thread hilo3 = new Thread(insTres);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
