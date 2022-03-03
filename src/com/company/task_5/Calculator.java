package com.company.task_5;

public class Calculator {
    private final double a;
    private final double b;

    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double addition() {
        return a + b;
    }

    public double subtraction() {
        return a - b;
    }

    public double multiplication() {
        return a * b;
    }

    public double division() {
        return a / b;
    }
}
