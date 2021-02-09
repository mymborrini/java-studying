package com.skynet;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewCollectorsMethod {

    /*
    * It is a composite of two downstream collectors. Every element is processed by both downstream collectors.
    * Then their results are passed to the merge function and transformed into the final result.
    *
    * In this example from a stream of 1,2,3,4,5 i will make the sum of all divided by the count
    * */
    public static void teeingMethod(){

        System.out.println("teeingMethod");
        double mean = Stream.of(1,2,3,4,5)
                .collect(Collectors.teeing(
                        Collectors.summingDouble(i -> i),
                        Collectors.counting(),
                        (sum, count) -> sum / count
                ));

        System.out.println(mean);
        System.out.println("");

    }

}
