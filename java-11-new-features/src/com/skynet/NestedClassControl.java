package com.skynet;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class MainClass {

    public static class NestedClass {

    }

}

public class NestedClassControl {

    public static void checkNestedClassBehaviour(){

        System.out.println("checkNestedClassBehaviour");

        if (MainClass.class.isNestmateOf(MainClass.NestedClass.class)){
            System.out.println("Main Class Contains Nested class");
        }

        if (MainClass.NestedClass.class.getNestHost().equals(MainClass.class)){
            System.out.println("Nested Class is Contained by Main Class");
        }

        Set<String> nestedMembers = Arrays.stream(MainClass.NestedClass.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());

        nestedMembers.forEach(System.out::println);

        System.out.println("");


    }

}
