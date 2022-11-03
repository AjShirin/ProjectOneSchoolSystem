package Project1;

import java.math.BigInteger;
import java.util.Scanner;

public class ProblemSolving {
	static boolean isExitSubMenue = true;
	Scanner sc = new Scanner(System.in);
	// Creating array to store the fibonacci value
		private static long[] fibonacciArrayStore;

		// Fibonacci function
		private static long fibonacciFunction(int number) {
			if (number <= 1) {
				return number;
			}

			if (fibonacciArrayStore[number] != 0) { // Primitive variables can never be null
				return fibonacciArrayStore[number];
			}
			long nthFibbonacciNumber = (fibonacciFunction(number - 1) + fibonacciFunction(number - 2));
			fibonacciArrayStore[number] = nthFibbonacciNumber;

			return nthFibbonacciNumber;

		}

		// Factorial function
		public static BigInteger calculationOfFactorial(int n) {
			BigInteger factorial = new BigInteger("1");
			for (int i = 2; i < n; i++) {
				factorial = factorial.multiply(BigInteger.valueOf(i));

			}
			return factorial;
		}


	public void problemSolving() {

	
	do{
		System.out.println("\n***************************");
		System.out.println("\n******* Welcome To The Coding Problem Menue*******");
		System.out.println("Select One Of The Following Option To Continue...");
		System.out.println("1. Find The Factotrial");
		System.out.println("2. Back To The Main Menu");
		System.out.println("3. Find The Fibonacci");
		int codingProblemUserInput = sc.nextInt();
		switch (codingProblemUserInput) {

		case 1:
			// Factorial
			System.out.println("Enter A Number To Find Its  Factorial : ");
			int userFactorialNuumber = sc.nextInt();
			BigInteger factorial = calculationOfFactorial(userFactorialNuumber);

			System.out.println(
					"The Factorial of " + " " + userFactorialNuumber + " " + "is : " + factorial);

			// calFactorialFunction

//			int fact = 1;
//			int i = 1;
//			System.out.println("Enter a number to find its  factorial : ");
//			int userNum = sc.nextInt();
//			// counting the factorial using while loop
//			while (i <= userNum) {
//				fact = fact * i;
//				i++; // increment i by 1
//			}
//
//			// printing the result
//			System.out.println("\nFactorial of " + userNum + " is: " + fact);
			break;
		case 3:
			// Fibonacci
//			/* It is a sequence of numbers that starts with 0 and then 1 
//			   and then each number after that is the sum 
//			   of the previous 2 numbers */
			System.out.println("Enter The Fibonacci Number You Want To Find:");
			int number = sc.nextInt();

			fibonacciArrayStore = new long[number + 1]; // example to claculate 3 fibonnaci so index
														// should be 4
			for (int i = 0; i <= number; i++) {
				System.out.print(fibonacciFunction(i) + " ");
			}

//		System.out.println("enter the length of the Fibonacci:");
//			int userFibonaccitLenght = sc.nextInt();
//			
//			int firstNumber = 0;
//			int secondNumber = 1;
//			int thirdNumber;
//			
//			System.out.println(firstNumber+ " " + secondNumber );
//			
//			
//			for (int i = 2; i < userFibonaccitLenght; i++) {
//				thirdNumber = firstNumber + secondNumber;
//				if(thirdNumber<=100) {
//					System.out.println(thirdNumber + " ");
//					firstNumber = secondNumber;
//					secondNumber = thirdNumber;
//				}
//			}

			break;
		case 2:
			isExitSubMenue = false;
			//mainMenueFunction();

			break;
		}
}while(isExitSubMenue);
}
}
