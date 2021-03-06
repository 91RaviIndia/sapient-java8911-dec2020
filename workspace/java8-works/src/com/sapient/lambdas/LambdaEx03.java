package com.sapient.lambdas;


//standard / contract
@FunctionalInterface
interface MathOperation {
	int operation(int a, int b); 
} 

public class LambdaEx03 {
	public static void main(String[] args) {
		// implementor (define the job which we want) 
		MathOperation add = (int a, int b ) -> a + b; 
		MathOperation sub = (a, b) -> a - b; 
		MathOperation mul = (a, b) -> a * b; 
		
		System.out.println("Addition : " + operate(100, 200, add));
		System.out.println("Substraction : " + operate(100, 40, sub));
		System.out.println("Multiplication : "+ operate(20, 20, mul));
	}

	// caller 
	 private static  int operate (int a, int b,MathOperation mo) {
		return mo.operation(a, b); 
	}
}
