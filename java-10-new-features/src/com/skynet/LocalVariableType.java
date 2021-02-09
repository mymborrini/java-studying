package com.skynet;

import java.util.HashMap;

public class LocalVariableType {

    /*
    * Note that there is no runtime overhead in using var nor does it make Java a dynamically typed language.
    * The type of the variable is still inferred at compile time and cannot be changed later.
    * */

    public static void varInitWithString(){
        var message = "Hello Java 10";
        if (message instanceof String){
            System.out.println("Everything is correct");
        }

        var idToMap = new HashMap<Integer, String>();
    }

    /*
    * Illegal Use of var
    * var n; // error: cannot use 'var' on variable without initializer
    * var emptyList = null; // error: variable initializer is 'null'
    * public var = "hello"; // error: 'var' is not allowed here. It will not work for non-local variables
    * var p = (String s) -> s.length() > 10; // error: lambda expression needs an explicit target-type
    * var arr = { 1, 2, 3 }; // error: array initializer needs an explicit target-type
    * */



}
