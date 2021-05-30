package com.main;

import java.util.Scanner;

public class calculatorByMe {

    public static void main(String[] args) throws ArithmeticException {

        int multiplyResult;
        int addResult;
        int subResult;

        // scanners for our input
        Scanner numOne = new Scanner(System.in);
        Scanner numTwo = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);

        // welcoming lines
        System.out.println("Hi, I am your calculator");
        System.out.println();
        // inputs
        System.out.println("Please input your first number");
        int firstInput = numOne.nextInt();
        System.out.println("now operator of your choice(+ - x /)");
        char numberOperation = operator.next().charAt(0);
        System.out.println("and lastly please input your second number");
        int secondInput = numTwo.nextInt();

        System.out.println("=");

        // mathematical operations
        multiplyResult = firstInput * secondInput;
        addResult = firstInput + secondInput;
        subResult = firstInput - secondInput;

        try {
            // mathematical operation results
        if (numberOperation == 'x' ) {
            System.out.println(multiplyResult);
        } 

        if (numberOperation == '+' ) {
            System.out.println(addResult);
        } 

        if (numberOperation == '-' ) {
            System.out.println(subResult);
        } 

        if (numberOperation != 'x' && numberOperation != '+' && numberOperation != '-') {
            //divideResult = firstInput / secondInput;
            //divideReminder = firstInput % secondInput;
            if (numberOperation == '/') {
               System.out.println(firstInput / secondInput + "." + firstInput % secondInput * 10 / secondInput); 
            } else {
                System.out.println("error");
            }
        }
        
        } catch(ArithmeticException e) {
            System.out.println("division by zero is not possible");
        }
    }    
}