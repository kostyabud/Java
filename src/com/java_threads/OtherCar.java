package com.java_threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class OtherCar extends Car   {

    public OtherCar(Semaphore sem, String name) {
        super(sem, name);
    }

    public void run(){
       try {
          TimeUnit.SECONDS.sleep(3);
          System.out.println(getName() +  " ждет.");
          TimeUnit.SECONDS.sleep(3);
           System.out.println(" Свободных парковычных мест нет");
           TimeUnit.SECONDS.sleep(2);
           System.out.println("Нет времени ждать, машина " + getName() + " уехала на другую стоянку");
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}







