package ru.naumkin.homeworks.homework17.myQueye;

public class QueueMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.print();
        System.out.println("______________________________");
        queue.poll();
        queue.poll();
        queue.print();
        queue.poll();
        queue.poll();
        queue.poll();

    }
}
