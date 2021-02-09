package com.skynet;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NewCollectionsMethods {

    public static void collectionToArray(){

        System.out.println("collectionToArray");

        List<String> simpleList = List.of("Java", "Kotlin", "Scala");
        String[] sampleArray = simpleList.toArray(String[]::new);
        System.out.println(sampleArray[0]);
        System.out.println(sampleArray[1]);
        System.out.println(sampleArray[2]);

        System.out.println("");
    }

    public static void theNotPredicateMethod(){

        System.out.println("theNotPredicateMethod");

        List<String> sampleList = List.of("Java", "\n \n", "Kotlin", " ");
        List<String> withoutBlanks = sampleList.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
        withoutBlanks.forEach(System.out::println);

        System.out.println("");
    }

    public static void localVariableSyntaxForLambda(){

        System.out.println("localVariableSyntaxForLambda");

        List<String> simpleList = List.of("Java", "Kotlin", "Scala");

        String resultList = simpleList.stream().map( (var x) -> x.toUpperCase(Locale.ROOT)).collect(Collectors.joining(", "));
        System.out.println(resultList);

        System.out.println("");
    }



}
