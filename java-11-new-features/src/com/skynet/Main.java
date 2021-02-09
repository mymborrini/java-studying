package com.skynet;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        NewStringMethods.multiLineString();
        NewFileMethods.stringToAndFromFiles();

        NewCollectionsMethods.collectionToArray();
        NewCollectionsMethods.theNotPredicateMethod();
        NewCollectionsMethods.localVariableSyntaxForLambda();

        NestedClassControl.checkNestedClassBehaviour();
    }
}
