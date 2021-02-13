package com.java_threads.optional_task;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Plane implements Runnable{
    private int planeID;
    Semaphore semaphore;
    public  boolean isTookOf = false;
    private int polosa = 10;

    public int getPolosa() {
        return polosa;
    }

    public Plane(int planeID, Semaphore semaphore) {
        this.planeID = planeID;
        this.semaphore = semaphore;
    }

    public int getPlaneID() {
        return planeID;
    }
    @Override
    public  void run(){

        try {
            if(!isTookOf) {
                TimeUnit.SECONDS.sleep(1);
                semaphore.acquire();
                System.out.println("Самолет " + getPlaneID() + " начал выход на  взетную полосу ");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Самолет " + getPlaneID() + " взлетел" );
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Полоса приняла самолет");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Полоса освободилась ");
                TimeUnit.SECONDS.sleep(3);
                semaphore.release(5);


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
