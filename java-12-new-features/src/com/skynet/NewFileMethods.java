package com.skynet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {

    // The method is used to compare two files and find the position of the first mismatched byte in their contents.
    public static void fileMisMatch() throws IOException {

        System.out.println("fileMisMatch");
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");

        Files.writeString(filePath1, "Simple text");
        Files.writeString(filePath2, "Simple text");

        long mismatch = Files.mismatch(filePath1, filePath2);
        if (mismatch == -1L){
            System.out.println("the two files are equal and this is OK");
        }

        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");

        Files.writeString(filePath3, "Simple article");
        Files.writeString(filePath4, "Simple tutorial");

        mismatch = Files.mismatch(filePath3, filePath4);

        System.out.println("The two files mismatch at " + mismatch + " letter, counting 0 the first one");
        System.out.println("");
    }

}
