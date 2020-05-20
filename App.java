package ru.kpfu.itis.valeev;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    private I i;

    private String command;

    private void init(){

        i = new I();
        Scanner sc = new Scanner(System.in);
        System.out.println("List of commands: name; sername; email; git; birthday; \n");

        while(true){
            command = sc.nextLine().trim().toLowerCase();

            switch (command){
                case "name":
                    System.out.println(">> " + i.getNAME() + "\n");
                    break;
                case "sername":
                    System.out.println(">> " + i.getSERNAME() + "\n");
                    break;
                case "email":
                    System.out.println(">> " + i.getEMAIL() + "\n");
                    break;
                case "git":
                    System.out.println(">> " + i.getGIT() + "\n");
                    break;
                case "birthday":
                    System.out.println(">> " + i.getBIRTHDAY().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + "\n");
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Unknown command...\n");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        App app = new App();
        app.init();
    }

}
