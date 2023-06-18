package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LoadingScreen {
    public boolean fileExists(final String filename) {
        final File ignitionKey = new File(filename);
        return ignitionKey.exists();
    }

    public void writeToFile(final String filename, final String insideFile) throws IOException {
        final FileWriter writer = new FileWriter(filename);
        writer.write(insideFile);
        writer.close();
    }

    public String readFromFile(final String filename) throws IOException {
        final FileReader readFromFile = new FileReader(filename);
        final StringBuilder insideFile = new StringBuilder();
        int data = readFromFile.read();
        while (data != -1) {
            insideFile.append((char) data);
            data = readFromFile.read();
        }
        readFromFile.close();
        return insideFile.toString();
    }
}

