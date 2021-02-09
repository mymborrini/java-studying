package com.skynet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {

    public static void stringToAndFromFiles() throws IOException {
        System.out.println("stringToAndFromFiles");
        Path tempPath = new File(".").toPath();
        Path filePath = Files.writeString(Files.createTempFile(tempPath, "demo", ".txt"), "Sample String");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);

        System.out.println("");
    }

}
