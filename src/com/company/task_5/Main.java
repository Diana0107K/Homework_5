package com.company.task_5;

public class Main {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        double one;
        double two;
        System.out.print("enter the first number ");
        one = readClass.readNextDouble();
        System.out.print("enter the second number ");
        two = readClass.readNextDouble();

        Calculator calculator = new Calculator(one, two);

        System.out.println("Select the operation number:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int action = (int) readClass.readNextDouble();
        switch (action) {
            case 1:
                System.out.println("result: " + calculator.addition());
                break;
            case 2:
                System.out.println("result: " + calculator.subtraction());
                break;
            case 3:
                System.out.println("result: " + calculator.multiplication());
                break;
            case 4:
                System.out.println("result: " + calculator.division());
                break;
            default:
                System.out.println("The wrong item is selected");
        }
    }
}
