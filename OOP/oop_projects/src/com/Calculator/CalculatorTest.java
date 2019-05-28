package com.Calculator;



public class CalculatorTest {
    public static void main(String[] args) {
        Calculator test = new Calculator(12,12,"+");
        test.performOperation();
        System.out.println(test.getResult());

        Calculator test2 = new Calculator(25,12,"-");
        test2.performOperation();
        System.out.println(test2.getResult());
    }
}


