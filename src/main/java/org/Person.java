package org;

public class Person {

    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {

        Person person = new Person();
        person.firstName = "Nikolay";
        person.lastName = "Bascov";
        person.age = 25;
        person.introduce();
    }

    public void introduce() {
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " лет.");
    }
}
