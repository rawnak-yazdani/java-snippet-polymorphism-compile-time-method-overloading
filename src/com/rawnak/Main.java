package com.rawnak;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();

        int intAdditionOfTwoNumbers = calculator.performAddition(2,3);
        int intAdditionOfFourNumbers = calculator.performAddition(2, 3, 7, 10);
        float floatAddition = calculator.performAddition(2.5f, 3.7f);

        System.out.println(intAdditionOfTwoNumbers);
        System.out.println(intAdditionOfFourNumbers);
        System.out.println(floatAddition);
    }
}
