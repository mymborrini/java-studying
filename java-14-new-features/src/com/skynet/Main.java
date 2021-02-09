package com.skynet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Use of records
        Person person = new Person("John Doe", "100 Linda in");
        Person person2 = new Person("John Doe");
        System.out.println(person.name());
        System.out.println(person2.address());
        System.out.println(Person.UNKNOWN_ADDRESS);

        Person unnamed = Person.unnamed("100 Linda in");
        System.out.println(unnamed.name());


    }
}
