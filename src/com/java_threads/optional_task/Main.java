package com.java_threads.optional_task;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sem =  new Semaphore(5);
        for (int i = 0; i <10; i++) {
            new Thread(new Plane(i, sem)).start();
        }


    }
}
