package org;

public class Person {

    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Nikolay", "Bascov", 25);
        Person person2 = new Person("Anna", "Ivanova", 18);
        Person person3 = new Person("Ivan", "Petrov", 34);
        person1.introduce();
        person3.introduce();
        person2.introduce();

        //Person person = new Person();
        //person.firstName = "Nikolay";
        //person.lastName = "Bascov";
        //person.age = 25;
        //person.introduce();
    }

    public void introduce() {
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " лет.");
    }
}
