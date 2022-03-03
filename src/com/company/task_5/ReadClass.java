package com.company.task_5;

import java.util.Scanner;

public class ReadClass {
    public double readNextDouble() {
        Scanner sc = new Scanner(System.in);
        double i = 0;

        if (sc.hasNextDouble()) {
            i = sc.nextDouble();
            return i;
        }

        if (!sc.hasNextDouble()) {
            System.out.println("enter a number");
        }
        return readNextDouble();
    }
}
