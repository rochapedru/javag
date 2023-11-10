package aula_04;

import java.util.Scanner;

public class lista03_exr06 {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero, multiplos = 0;
		double media, soma = 0;
		do {
			System.out.println("Digite numeros: ");
			numero = Leia.nextInt();
			if (numero % 3 == 0 && numero > 0) {
				soma = soma + numero;
				multiplos ++;
			}
		
		}while(numero != 0);
		if (multiplos > 0) {
			media = soma / multiplos;
			System.out.println("A media dos multiplos de 3 é: " + media);
		}
		
		

	}
}
