package chap02;

import java.util.Scanner;

public class S02Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.println("Insert a number");
		number1 = input.nextInt();
		
		System.out.println("Insert another number");
		number2 = input.nextInt();
		
		sum = number1+number2;
		
		System.out.printf("Sum is %d \n", sum);
		
		input.close();
	} // Fim do método main

} // Fim da classe S02Scanner
