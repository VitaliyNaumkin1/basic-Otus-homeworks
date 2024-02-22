package ru.naumkin.homeworks.homework29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static final Object mon = new Object();
    static boolean isMethod_A_Free = true;
    static boolean isMethod_B_Free = false;
    static boolean isMethod_C_Free = false;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 5; i++) {
            executorService.execute(() -> {
                printA();
                printB();
                printC();
            });
        }
        executorService.shutdown();
    }


    //ABC ABC ABC ABC ABC ABC
    public static void printA() {
        synchronized (mon) {
            while (!isMethod_A_Free) {
                try {
                    mon.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            isMethod_A_Free = false;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("A");
            isMethod_B_Free = true;
            mon.notifyAll();
        }
    }


    public static void printB() {
        synchronized (mon) {
            while (!isMethod_B_Free) {
                try {
                    mon.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            isMethod_B_Free = false;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("B");
            isMethod_C_Free = true;
            mon.notifyAll();
        }
    }

    public static void printC() {
        synchronized (mon) {
            while (!isMethod_C_Free) {
                try {
                    mon.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            isMethod_C_Free = false;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("C");
            isMethod_C_Free = true;
            isMethod_A_Free = true;
            mon.notifyAll();
        }
    }
}