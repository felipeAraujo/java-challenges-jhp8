package chap02;

import java.util.Scanner;

public class S0230SpaceDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String resultado;
		
		String numero;
		
		System.out.println("Insert a number");
		numero = input.next();
		
		resultado = "";
		
		for (int i=0; i<numero.length(); i++){
			if (i == 0)
				resultado = numero.charAt(i)+"";
			else
				resultado = resultado + "   " + numero.charAt(i);
		}
		
		System.out.println(resultado);
		
		input.close();
	}

}

