package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the First Number:");

		double number1 = scanner.nextDouble();

		System.out.println("Enter the Second Number:");
		double number2 = scanner.nextDouble();

		double result = 0;

		System.out.println("Make any choices in this operators to perform operation (+,-,*,/)");

		char operator = scanner.next().charAt(0);

		switch (operator) {
		case '+':
			result = number1 + number2;
			break;

		case '-':
			result = number1 - number2;
			break;

		case '*':
			result = number1 * number2;
			break;
		case '/':
			if (number2 != 0) {
				result = number1 / number2;
			} else {
				System.out.println("Undefined Behaviour,Division By Zero");
			}
			break;

		default:
			System.out.println("Invalid Operation");
		}

		System.out.println(result);
	}
}
