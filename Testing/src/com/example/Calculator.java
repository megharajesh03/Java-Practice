package com.example;

public class Calculator {
    private CalculatorService cserv;

    public Calculator(CalculatorService cserv) {
        this.cserv = cserv;
    }

    public int addOperation(int x, int y) {
        return cserv.add(x, y);  // Should call the mock here
    }
}
