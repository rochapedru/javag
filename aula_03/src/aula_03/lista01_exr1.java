package aula_03;

import java.util.Scanner;

public class lista01_exr1 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b, c, soma;
		a = Leia.nextInt();
		b = Leia.nextInt();
		c = Leia.nextInt();
		soma = a + b;
		
		if (soma > c) {
			System.out.println("A soma de A + B: " + soma + "´é maior que C: " + c);
		}else if (soma < c) {
			System.out.println("A soma de A + B: " + soma + "´é menor que C: " + c);
		}else if (soma == c) {
			System.out.println("A soma de A + B: " + soma + "´é igual a C: " + c);
		}
	}
}
