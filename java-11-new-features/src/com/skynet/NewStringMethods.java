package com.skynet;

import java.util.List;
import java.util.stream.Collectors;

public class NewStringMethods {

    public static void multiLineString(){
        System.out.println("multiLineString");

        String multiLineString = "Java 11 \n  \n new features\n are beautiful";

        List<String> lines = multiLineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        lines.forEach(System.out::println);
        System.out.println("");

    }

}
