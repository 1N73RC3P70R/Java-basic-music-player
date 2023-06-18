package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LoadingScreen {
    public boolean fileExists(String filename) {
        File ignitionKey = new File(filename);
        return ignitionKey.exists();
    }

    public void writeToFile(String filename, String insideFile) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(insideFile);
        writer.close();
    }

    public String readFromFile(String filename) throws IOException {
        FileReader readFromFile = new FileReader(filename);
        StringBuilder insideFile = new StringBuilder();
        int data = readFromFile.read();
        while (data != -1) {
            insideFile.append((char) data);
            data = readFromFile.read();
        }
        readFromFile.close();
        return insideFile.toString();
    }
}

