package com.skynet;

public class NewStringMethods {

    public static void indentMethod(){

        System.out.println("indentMethod");

        String text = "Hello Java 12, \n Welcome";
        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);

        System.out.println("");
    }

}
