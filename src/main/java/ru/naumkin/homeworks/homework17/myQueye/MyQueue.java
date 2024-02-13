package ru.naumkin.homeworks.homework17.myQueye;

import ru.naumkin.homeworks.homework17.linkedList.MyLinkedList;

public class MyQueue {
    private final MyLinkedList linkedList = new MyLinkedList();

    public void offer(String data) {
        linkedList.addLast(data);
    }

    public String poll() {
        String returnedElement = linkedList.getFirst();
        linkedList.remove(1);
        return returnedElement;
    }

    public void print() {
        linkedList.print();
    }
}
