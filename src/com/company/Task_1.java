package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Task_1  {

    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
        String s = in.nextLine();
            if (s.equals("exit")) {
                break;
            }
            System.out.println(s);
        }
        in.close();
    }
}
