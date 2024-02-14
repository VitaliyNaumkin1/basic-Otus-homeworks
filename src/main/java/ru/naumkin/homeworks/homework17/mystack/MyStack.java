package ru.naumkin.homeworks.homework17.mystack;

import ru.naumkin.homeworks.homework17.linkedList.MyLinkedList;

public class MyStack {
    private final MyLinkedList linkedList = new MyLinkedList();

    public void push(String data) {
        linkedList.addLast(data);
    }

    public String pop() {
        String returnedElement = linkedList.getLast();
        linkedList.remove(linkedList.getSize());
        return returnedElement;
    }

    public void print() {
        linkedList.print();
    }

}
