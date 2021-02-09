package com.skynet;

public class PreviewChanges {

    // Using yield, we can now effectively return values from a switch expression:
    public static void yieldSwitchExpression(){

        System.out.println("yieldSwitchExpression");
        var me = 4;
        var operation = "squareMe";

        var result = switch (operation){
            case "doubleMe" -> {
                yield me * 2;
            }
            case "squareMe" -> {
                yield me * me;
            }

            default -> me;

        };

        System.out.println(result);
        System.out.println("");
    }

    // Using textBlocks
    public static void jsonTextBlocks(){

        System.out.println("jsonTextBlocks");

        String textBlockJSON = """
                {
                    "name": "Mattia",
                    "job": "Software developer",
                    "website": "https://%s.com"
                }
                """;

        textBlockJSON.stripIndent(); // removing incidental withe_space
        textBlockJSON.translateEscapes(); //translates escape sequences such as “\\t” to “\t”
        textBlockJSON = textBlockJSON.formatted("mattia.software_developer"); //Works in the exact same way of String format

        System.out.println(textBlockJSON);
        if (textBlockJSON.contains("https://mattia.software_developer.com")){
            System.out.println("Formatting works correctly");
        }

        System.out.println("");

    }

}
