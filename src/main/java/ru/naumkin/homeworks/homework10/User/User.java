package ru.naumkin.homeworks.homework10.User;

public class User {
    public String name;
    public String surName;
    public String middleName;
    public String email;
    public int yearOfBirth;


    public User(String name, String surName, String middleName, String email, int yearOfBirth) {
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
    }

    public void info() {
        System.out.println("ФИО: " + surName + " " + name + " " + middleName);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("email: " + email);
    }


}
