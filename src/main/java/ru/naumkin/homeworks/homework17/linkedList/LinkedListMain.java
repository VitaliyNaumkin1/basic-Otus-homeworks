package ru.naumkin.homeworks.homework17.linkedList;


public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast("Hello");
        myLinkedList.addLast("world");
        myLinkedList.addLast("bye");
        myLinkedList.addLast("last");
        myLinkedList.print();
        System.out.println("______________________________");
        myLinkedList.addFirst("first");
        myLinkedList.print();
        System.out.println("______________________________");
        myLinkedList.add(2, "newElement");
        myLinkedList.print();
        System.out.println("______________________________");
        myLinkedList.remove(13);
        myLinkedList.print();

        System.out.println("........................");
        myLinkedList.remove(-13);
        myLinkedList.remove(1);
        myLinkedList.print();
        System.out.println("........................");

        System.out.println("______________________________");
        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addFirst("fffffffff");
        myLinkedList2.print();
        System.out.println("______________________________");
        myLinkedList2.addLast("last");
        myLinkedList2.print();
        System.out.println("______________________________");

    }
}
