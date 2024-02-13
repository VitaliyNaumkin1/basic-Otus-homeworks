package ru.naumkin.homeworks.homework17.myStack;

public class StackMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.print();
        System.out.println("______________________________");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.print();
        System.out.println("______________________________");
    }
}
