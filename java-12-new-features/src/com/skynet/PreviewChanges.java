package com.skynet;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PreviewChanges {

    // A notable difference is that we can assign a switch statement directly to the variable
    // It's also possible to execute code in switch expressions without returning any value:
    public static void switchExpression(){

        // Before
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        String typeOfDay = "";

        switch (dayOfWeek){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day off";
        }

        // now
        typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working day";
            case SATURDAY, SUNDAY -> "Day off";
        };

        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                // Some Logic

            }
            case SATURDAY, SUNDAY -> {
                // Some logic
            }
        };

        System.out.println(typeOfDay);
    }

    // This can avoid explicitly typecast the object to access its features
    public static void patternMatching(){
        // before
        Object obj = "Hello World";
        int length = 0;
        if (obj instanceof String){
            String s = (String) obj;
            length = s.length();
        }

        if (obj instanceof String s){
            length = s.length();
        }

        System.out.println(length);



    }

}
