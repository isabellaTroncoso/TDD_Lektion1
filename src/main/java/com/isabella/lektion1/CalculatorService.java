package com.isabella.lektion1;

public class CalculatorService {

    public double addition (double a, double b) {
        return  a + b;
    }

    public int subtract (int a, int b) {
        return  a - b;
    }

    public int multiply ( int a, int b) {
        return a * b;
    }

    public int divide (int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
