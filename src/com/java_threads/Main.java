package com.java_threads;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(2);
        Thread car = new Thread(new Car(sem, "Ford"));
        Thread car1 = new Thread(new Car(sem, "Audi"));
        Thread car2 = new Thread(new OtherCar(sem, "BMW"));

        car.start();
        car1.start();
        car2.start();



    }

}
