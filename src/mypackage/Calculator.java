package mypackage;
import java.util.Scanner;


public class Calculator {
	//Methods
	static void Add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	static void Subtract(double num1, double num2) {
		System.out.println(num1-num2);
	}
	static void Multiply(double num1, double num2) {
		System.out.println(num1*num2);
	}
	static void Divide(double num1, double num2) {
		System.out.println(num1/num2);
	}
	static void Exit(int num) {
		System.out.println("Exited out of program");
	}
	
	public static void main(String[] args) {
		//variables for calculator
		Scanner scan = new Scanner(System.in);
		
		double num1;
		double num2;
		int calculate;
		
		String calculator1="Type in your calculator option: " + "1: addition, 2: Subtract, 3: Multiply, 4: Divide, 5: Exit";
		String numStr1 = "Type in your first number";
		String numStr2 = "Type in your second number";
		//starting program
		System.out.println(numStr1);
		num1 = scan.nextDouble();
		System.out.println(numStr2);
		num2 = scan.nextDouble();
		//initializing calculator
		System.out.println(calculator1);
		calculate = scan.nextInt();
		
		//switch case loop
		
		try
		{	
			switch (calculate) {
			case 1:
				System.out.println(num1 + " + " + num2 + " is ");
				Add(num1, num2);
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " is ");
				Subtract(num1, num2);
				break;
			case 3:
				System.out.println(num1 + " x " + num2 + " is ");
				Multiply(num1, num2);
				break;
			case 4:
				System.out.println(num1 + " / " + num2 + " is ");
				Divide(num1, num2);
				break;
			case 5:
				Exit(calculate);
				System.exit(0);
				break;
			}
		} catch(Exception e) {System.out.println(e);} {
			System.out.println("invalid operator");
		}
		scan.close();
	}
		
}