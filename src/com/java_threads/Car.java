package com.java_threads;

import java.util.concurrent.Semaphore;
import static java.lang.Thread.sleep;

public class Car implements Runnable  {
    Semaphore sem;
    public boolean inPark = false;

    public Car(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }
    private String name;
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            if (!inPark) {
                System.out.println(getName() + " взезжает на парковку");
                sem.acquire();
                sleep(500);
                System.out.println("Автомобиль " + getName() + " занял парковочное место");
                inPark = true;
                sleep(500);
                sem.release();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}



