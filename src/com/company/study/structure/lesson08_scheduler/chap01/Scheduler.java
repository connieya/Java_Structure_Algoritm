package com.company.study.structure.lesson08_scheduler.chap01;

import java.util.Scanner;

public class Scheduler {

    public Event[] events = new Event[100];

    public void processCommand() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("$ ");
            String command = sc.next();
            if (command.equals("addEvent")) {

            } else if (command.equals("list")) {

            } else if (command.equals("show")) {

            } else if (command.equals("exit")) {
                break;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {

        Scheduler app = new Scheduler();
        app.processCommand();

    }

}
