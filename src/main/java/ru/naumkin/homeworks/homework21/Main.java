package ru.naumkin.homeworks.homework21;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        double[] array = new double[100000000];
        double[] array2 = new double[100000000];

        long timeStart1 = System.currentTimeMillis();
        fillArray(array);
        System.out.println("Время выполенния одним потоком: " + (System.currentTimeMillis() - timeStart1));

        long timeStart2 = System.currentTimeMillis();
        Thread[] threads1 = new Thread[4];
        int range = 0;
        for (int i = 0; i < threads1.length; i++) {
            int finalRange = range;
            threads1[i] = new Thread(() -> fillArrayWithFourThreads(array2, finalRange));
            range += 25000000;
        }

        for (int i = 0; i < threads1.length; i++) {
            threads1[i].start();
        }
        for (int i = 0; i < threads1.length; i++) {
            threads1[i].join();
        }
        System.out.println("Время выполенния 4 потоками: " + (System.currentTimeMillis() - timeStart2));
    }

    public static void fillArray(double[] array) {
        System.out.println("Идёт выполнение цикла 1 потоком ....");
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void fillArrayWithFourThreads(double[] array, int range) {
        for (int i = range; i < range + 25000000; i++) {
            if (array[i] != 0) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        }
    }
}


