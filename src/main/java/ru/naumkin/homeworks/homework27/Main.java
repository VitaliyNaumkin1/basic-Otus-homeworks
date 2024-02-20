package ru.naumkin.homeworks.homework27;


import ru.naumkin.homeworks.homework27.fruit.Apple;
import ru.naumkin.homeworks.homework27.fruit.Fruit;
import ru.naumkin.homeworks.homework27.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Apple> appleBox3 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        fillTheBoxWithApples(appleBox1, 5);
        fillTheBoxWithApples(appleBox2, 5);
        fillTheBoxWithApples(appleBox3, 4);
        fillTheBoxWithOrange(orangeBox, 2);
        fillBoxWithVariousFruits(fruitBox, 10);

        System.out.println("applebox1 weight: " + appleBox1.weight());

        System.out.println("orangeBox weight: " + orangeBox.weight());

        System.out.println("fruitBox weight: " + fruitBox.weight());

        System.out.println("------------------------------------------------");
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox));
        System.out.println(appleBox1.compare(fruitBox));
        System.out.println(fruitBox.compare(appleBox3));
        System.out.println(orangeBox.compare(appleBox3));

        System.out.println(" appleBox1:");
        appleBox1.print();
        System.out.println(" fruitBox:");
        fruitBox.print();
        appleBox1.shiftFruits(fruitBox);
        System.out.println(" appleBox1:");
        appleBox1.print();
        System.out.println(" fruitBox:");
        fruitBox.print();
        System.out.println("------------------------------------------------");

        System.out.println(" appleBox2:");
        appleBox2.print();
        System.out.println(" appleBox3:");
        appleBox3.print();
        appleBox2.shiftFruits(appleBox3);
        System.out.println(" appleBox2:");
        appleBox2.print();
        System.out.println(" appleBox3:");
        appleBox3.print();


    }

    public static void fillBoxWithVariousFruits(Box<Fruit> box, int amount) {
        for (int i = 0; i < amount; i++) {
            if (i % 2 == 0) {
                box.add(new Orange());
                continue;
            }
            box.add(new Apple());
        }
    }

    public static void fillTheBoxWithApples(Box<Apple> box, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(new Apple());
        }
    }

    public static void fillTheBoxWithOrange(Box<Orange> box, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(new Orange());
        }
    }


}
