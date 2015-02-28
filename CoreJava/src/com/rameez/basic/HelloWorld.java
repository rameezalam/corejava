package com.rameez.basic;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		//Added By Zeeshan	
		int input= 25;		
		int fact = factorial(input);
		System.out.println("Factorial of "+input+" is : "+fact);
	}

	/**
	 * This method will calculate the factorial of a number
	 * @param n
	 * @return
	 */
	private static int factorial(int n) {		
		if(n == 1){
			return 1;
		}
		return factorial(n-1)*n;
	}

}
