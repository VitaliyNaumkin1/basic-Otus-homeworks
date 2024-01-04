package ru.naumkin.homeworks.homework10.User;

public class UserMain {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("Vitaliy", "Petrov", " Andreevich", "mail1@dsffdf", 2001),
                new User("Petr", "Petrov", " Alekseevich", "mail2@dsffdf", 1870),
                new User("Kolya", "Sidorov", " Sergeevich", "mail3@dsffdf", 1945),
                new User("Sergey", "fksdjfks", " Alekseevich", "mail4@dsffdf", 1999),
                new User("Aleksey", "Sidorov", " Sergeevich", "mail5@dsffdf", 2017),
                new User("Nikita", "Petrov", " Sergeevich", "mail6@dsffdf", 1870),
                new User("Pavel", "Pavlov", " Sergeevich", "mail7@dsffdf", 1870),
                new User("Kolya", "Aleekseev", " Sergeevich", "mail8@dsffdf", 1996),
                new User("Dmitriy", "Petrov", " Sergeevich", "mail9@dsffdf", 1870),
                new User("Vitaliy", "Solntcev", " Sergeevich", "mail10@dsffdf", 2007)};
        printUsersOverCertainAge(users, 40);
    }

    public static void printUsersOverCertainAge(User[] users, int age) {
        int currentYear = 2023;
        System.out.println("Список людей старше " + age + ": ");
        for (User user : users) {
            int userAge = currentYear - user.yearOfBirth;
            if (userAge > 40) {
                user.info();
                System.out.println();
            }
        }
    }

}
