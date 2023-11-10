package aula_04;

import java.util.Scanner;

public class lista01_exr02 {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero, par = 0, impar = 0;
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "° numero");
			numero = Leia.nextInt();
			
			if (numero % 2 ==  0 ) {
				par ++;
			}else {
				impar ++;
			}
		System.out.println("Numeros par:  " + par);
		System.out.println("Numeros impar: " + impar);
		}

	}
}
