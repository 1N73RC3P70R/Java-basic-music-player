package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("SECRET FILE.txt");
        Scanner scanner = new Scanner(System.in);

        //check if "ignition key" is in position
        if (file.exists()) {
            System.out.println("Loading.");
            System.out.println("Loading..");
            System.out.println("Loading...");
        } else {
            System.out.println("Failed to load!\nError 001");
            return;
        }

        System.out.println("Who is starting up the program?\n");
        String userName = scanner.nextLine();

//starting screen
        try {
            FileWriter welcome = new FileWriter("Welcome.txt");
            welcome.write("Welcome, ");
            welcome.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }}