package org.example;

import java.util.Scanner;

public class UserInteraction {


    Scanner scanner = new Scanner(System.in);

    public String askUsername() {
        System.out.println("Who is starting up the program?\n");
        return scanner.nextLine();
    }

    public void display(String text){
        System.out.println(text);
    }
    public void loadingMessage() {
        System.out.println("Loading.");
        System.out.println("Loading..");
        System.out.println("Loading...");
    }

    public void ignitionKeyError() {
        System.out.println("Failed to load!\nError 001");
    }


}
