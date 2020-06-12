package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int calculatorA = 12;
        int calculatorB = 5;

        if(calculator.add(calculatorA,calculatorB)==calculatorA+calculatorB){
            System.out.println("Test successful");
        } else {
            System.out.println("Error!");
        }

        if(calculator.substract(calculatorA,calculatorB)==calculatorA-calculatorB){
            System.out.println("Test successful");
        } else {
            System.out.println("Error!");
        }

    }

}