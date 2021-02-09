package com.skynet;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class CollectionsNewApi {

    // copyof return an immutable list
    public static void unmodifiableCopyOf(){
        List<Integer> someIntList = List.of(1, 2,3,4);
        List<Integer> copyList = List.copyOf(someIntList);
        try {
            copyList.add(5);
        } catch (UnsupportedOperationException exception){
            System.out.println("UnsupportedOperationException raise everything works ok: " + exception.getLocalizedMessage());
        }

    }

    public static void unmodifiableCollections(){
        List<Integer> someIntList = List.of(1, 2,3,4);
        List<Integer> evenList = someIntList.stream().filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        try {
            evenList.add(5);
        } catch (UnsupportedOperationException exception){
            System.out.println("UnsupportedOperationException raise everything works ok: " + exception.getLocalizedMessage());
        }
    }

    public static void optionalOrElseThrow(){
        List<Integer> someIntList = List.of(1, 3);
        try {
            Integer firstEven = someIntList.stream().filter(i -> i % 2 == 0).findFirst().orElseThrow();
        } catch (NoSuchElementException exception){
            System.out.println("NoSuchElementException raise everything works ok: " + exception.getLocalizedMessage());
        }

    }

}
