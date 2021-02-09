package com.skynet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionNewAPI {

    // I create inline with ease an immutable set
    Set<String> strKeySet = Set.of("key1", "key2", "key3");

    public static void optionalStream(){

        List<Optional<String>> listOfOptionals = new ArrayList<>();
        List<String> filteredList = listOfOptionals.stream().flatMap(Optional::stream).collect(Collectors.toList());

    }

}
