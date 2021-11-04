package com.company;

public class PrintMe implements  Runnable{


    public PrintMe() {
    }

    @Override
    public void run() {
        try {
            for (int i=1; i<10; i++){
                Thread.sleep(2000);
                System.out.println("Numero " + i);
            }
        }catch (InterruptedException exc){
            System.out.println("Interrumpido.");
        }

    }
}
