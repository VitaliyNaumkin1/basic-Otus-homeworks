package ru.naumkin.homeworks.homework16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
            return;
        }
        Set<String> numberPhonesSet = new HashSet<>();
        numberPhonesSet.add(phoneNumber);
        phoneBook.put(name, numberPhonesSet);
    }

    public void find(String name) {
        if (phoneBook.containsKey(name)) {
            Set<String> number = phoneBook.get(name);
            System.out.println(name + ": " + number);
            return;
        }
        System.out.println("Человека с такой фамилией нету в записях");
    }

    public void containsPhoneNumber(String phoneNumber) {
        Set<Map.Entry<String, Set<String>>> entries = phoneBook.entrySet();
        for (Map.Entry<String, Set<String>> entry : entries) {
            if (entry.getValue().contains(phoneNumber)) {
                System.out.println("В списке существует такой телефон");
                return;
            }
        }
        System.out.println("В списке такого телефона нету");
    }

    public void print() {
        Set<Map.Entry<String, Set<String>>> entries = phoneBook.entrySet();
        for (Map.Entry<String, Set<String>> entry : entries) {
            System.out.println("Name: " + entry.getKey() + " - phone number: " + entry.getValue());
        }
    }

}

