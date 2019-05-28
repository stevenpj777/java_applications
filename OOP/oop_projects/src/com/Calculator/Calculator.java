package com.Calculator;

import javax.swing.plaf.OptionPaneUI;
import java.util.*;
import java.lang.*;
public class Calculator {
    private double result;

    private double OperandOne;
    private double OperandTwo;
    private String Operation;


    public Calculator(double num1, double num2, String operand) {

        OperandOne = num1;
        OperandTwo = num2;
        Operation = operand;
        System.out.println(OperandOne);
        System.out.println(OperandTwo);
        System.out.println(Operation);

    }

    public void performOperation() {
        if (Operation == "+") {
            result = OperandOne + OperandTwo;
        }
        else if (Operation == "-") {
            result = OperandOne - OperandTwo;
        }
    }

    public double getResult() {
        return result;
    }
}
