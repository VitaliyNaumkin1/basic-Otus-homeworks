package ru.naumkin.homeworks.homework17.linkedList;

public class MyLinkedList {

    private Node firstElement;
    private Node lastElement;

    private int size;

    public MyLinkedList() {
        this.firstElement = null;
        this.lastElement = null;
        this.size = 0;
    }


    private static class Node {
        private final String content;
        private Node previous;
        private Node next;

        public Node(String content) {
            this.content = content;
            this.previous = null;
            this.next = null;
        }

        public String getContent() {
            return content;
        }

        public Node getPrevious() {
            return previous;
        }

        public Node getNext() {
            return next;
        }


        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void addFirst(String data) {
        Node newFirstElement = new Node(data);
        if (isEmpty()) {
            firstElement = newFirstElement;
            lastElement = newFirstElement;
            size++;
            return;
        }

        newFirstElement.setNext(firstElement);
        firstElement.setPrevious(newFirstElement);
        firstElement = newFirstElement;
        size++;
    }


    public void addLast(String data) {
        Node newLastElement = new Node(data);
        if (isEmpty()) {
            firstElement = newLastElement;
            lastElement = newLastElement;
            size++;
            return;
        }
        lastElement.setNext(newLastElement);
        newLastElement.setPrevious(lastElement);
        lastElement = newLastElement;
        size++;
    }

    public String getFirst() {
        try {
            return firstElement.getContent();
        } catch (NullPointerException e) {
            System.out.println("Список пустой");
        }
        return null;
    }

    public String getLast() {
        try {
            return lastElement.getContent();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Список пустой");
        }
        return null;
    }


    public void add(int position, String data) {
        if (size < position) {
            addLast(data);
            return;
        }
        if (position < 0) {
            System.out.println("Невозможно вставить элемент на отрицательную позицию ");
            return;
        }

        if (position == 1 || size == 0) {
            addFirst(data);
            return;
        }

        Node newElement = new Node(data);
        Node currentElement = firstElement;
        int count = 1;
        while (true) {
            if (count != position) {
                currentElement = currentElement.getNext();
                count++;
                continue;
            }
            newElement.setNext(currentElement);
            newElement.setPrevious(currentElement.getPrevious());
            currentElement.getPrevious().setNext(newElement);
            currentElement.setPrevious(newElement);
            size++;
            return;
        }
    }

    public void remove(int position) {
        if (size == 0) {
            System.out.println("Удаление элемента с позицией " + position + " невозможно, список пустой");
            return;
        }
        if (position <= 0) {
            System.out.println("Невозможно удалить элемент с позицией: " + position + " ,номер позиции должен быть больше нуля");
            return;
        }

        if (size == 1) {
            firstElement = null;
            lastElement = null;
            size--;
            return;
        }


        if (position == 1) {
            firstElement = firstElement.getNext();
            firstElement.setPrevious(null);
            size--;
            return;
        }

        if (size <= position) {
            lastElement = lastElement.getPrevious();
            lastElement.setNext(null);
            size--;
            return;
        }


        Node currentElement = firstElement;
        int count = 1;
        while (true) {
            if (count != position) {
                currentElement = currentElement.getNext();
                count++;
                continue;
            }
            currentElement.previous.next = currentElement.next;
            currentElement.next.previous = currentElement.previous;
            size--;
            return;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Не содержит элементов");
            return;
        }

        Node currentElement = firstElement;
        while (currentElement != null) {
            System.out.println(currentElement.getContent());
            currentElement = currentElement.getNext();
        }

        System.out.println("Size = " + size);

    }

    public String get(int requiredPosition) {

        if (size == 0) {
            System.out.println("В списке нету элементов");
            return null;
        }

        if (requiredPosition > size) {
            System.out.println("Размер списка меньше чем указанная позиция");
            return null;
        }


        Node currentElement = firstElement;
        int currentPosition = 1;
        while (true) {
            if (currentPosition != requiredPosition) {
                currentElement = currentElement.getNext();
                currentPosition++;
                continue;
            }
            return currentElement.getContent();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return firstElement == null;
    }


}
