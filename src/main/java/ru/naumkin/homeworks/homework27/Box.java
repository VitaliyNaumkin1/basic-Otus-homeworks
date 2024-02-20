package ru.naumkin.homeworks.homework27;


import ru.naumkin.homeworks.homework27.fruit.Fruit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<E extends Fruit> {
    private List<E> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }


    public void add(E fruit) {
        fruits.add(fruit);
    }


    public int weight() {
        int weight = 0;
        if (fruits.isEmpty()) {
            return weight;
        }

        for (int i = 0; i < fruits.size(); i++) {
            weight += fruits.get(i).getWeight();
        }

        return weight;
    }


    public boolean compare(Box<? extends Fruit> box) {
        return weight() == box.weight();
    }

    public void shiftFruits(Box<? super E> box) {
        Iterator<E> iterator = fruits.listIterator();
        while (iterator.hasNext()) {
            box.add(iterator.next());
            iterator.remove();
        }
    }

    public void print() {
        for (E f : fruits) {
            System.out.println(f);
        }
    }

}
