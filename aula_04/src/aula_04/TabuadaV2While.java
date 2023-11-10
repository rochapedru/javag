package aula_04;

import java.util.Scanner;

public class TabuadaV2While {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero, contador = 1;
		
		System.out.println("Digite um numero: ");
		numero = Leia.nextInt();
		
		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
			contador ++;
		}
		
		
		// TODO Auto-generated method stub
		

	}

}