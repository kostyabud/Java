package com.java_threads.optional_task;

import java.util.concurrent.Semaphore;

public class PlaneTwo  extends Plane{
    public PlaneTwo(int planeID, Semaphore semaphore) {
        super(planeID, semaphore);
    }

    @Override
    public synchronized void run() {

    }
}
