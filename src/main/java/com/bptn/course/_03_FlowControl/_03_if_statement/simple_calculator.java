package com.bptn.course._03_FlowControl._03_if_statement;

import java.util.*;

public class simple_calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num1, num2;
		int operator, choice = 0;
		System.out.println("/...Calculator Menu.../");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 to square a number");
		System.out.println("Press 6 to find a square root");
		System.out.println("Press 7 to find reciprocal");
		System.out.println("Select your Operator: ");
		operator = scanner.nextInt();

		if (choice >= 1 && choice <= 7)
			;
		{

			if (operator == 1) {
				System.out.println("Enter the first number: ");
				num1 = scanner.nextInt();

				System.out.println("Enter second number: ");
				num2 = scanner.nextInt();

				System.out.println("The sum of numbers " + num1 + "and " + num2 + "is =  " + (num1 + num2));

				System.out.println("To continue, Press 0, else press any other number to exit");
			} else if (operator == 2) {
				System.out.println("Enter the first number: ");
				num1 = scanner.nextInt();

				System.out.println("Enter second number: ");
				num2 = scanner.nextInt();

				System.out.println("The difference of numbers " + num1 + "and " + num2 + "is = " + (num1 - num2));

				System.out.println("To continue, Press 0, else press any other number to exit");
			} else if (operator == 3) {
				System.out.println("Enter the first number: ");
				num1 = scanner.nextInt();

				System.out.println("Enter second number: ");
				num2 = scanner.nextInt();

				System.out.println("The product of numbers " + num1 + "and " + num2 + "is = " + (num1 * num2));

				System.out.println("To continue, Press 0, else press any other number to exit");
			} else if (operator == 4) {
				System.out.println("Enter the first number: ");
				num1 = scanner.nextInt();

				System.out.println("Enter second number: ");
				num2 = scanner.nextInt();

				System.out.println("The difference of numbers " + num1 + "and " + num2 + "is = " + (num1 / num2));

				System.out.println("To continue, Press 0, else press any other number to exit");
			} else if (operator == 5) {
				System.out.println("Enter the number to square: ");
				num1 = scanner.nextInt();

				System.out.println("Enter the power: ");
				num2 = scanner.nextInt();

				System.out.println("The square of number " + num1 + "is = " + Math.pow(num1, num2));

				System.out.println("To continue, Press 0, else press any other number to exit");
			} else if (operator == 6) {
				System.out.println("Enter the first number: ");
				num1 = scanner.nextInt();

				System.out.println("The square root of numbers " + num1 + "and " + "is = " + Math.sqrt(num1));

				System.out.println("To continue, Press 0, else press any other number to exit");
			} else if (operator == 7) {
				System.out.println("Enter the number to find reciprocal: ");
				num1 = scanner.nextInt();

				System.out.println("The reciprocal of the number " + num1 + "is = " + (1 / num1));

				System.out.println("To continue, Press 1, else press any other number to exit");
			} else {
				System.err.println("Invalid operator");
				System.exit(0);

			}

		}

		scanner.close();
	}

}
