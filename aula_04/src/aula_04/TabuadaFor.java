package aula_04;

import java.util.Scanner;

public class TabuadaFor {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = Leia.nextInt();
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
		}
		
		
		// TODO Auto-generated method stub
		

	}

}
