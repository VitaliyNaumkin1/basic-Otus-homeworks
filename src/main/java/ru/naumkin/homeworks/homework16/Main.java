package ru.naumkin.homeworks.homework16;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasutin", "89234551754");
        phoneBook.add("Sidorov", "89264332651");
        phoneBook.add("Sidorov", "3213213");
        phoneBook.add("Petrov", "2132123213");
        phoneBook.add("Sidorov", "1111111");

        phoneBook.print();
        phoneBook.find("Vasutin");
        phoneBook.find("Sidorov");

        phoneBook.containsPhoneNumber("2132123213");
        phoneBook.containsPhoneNumber("234234");
    }
}

