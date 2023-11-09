package aula_02;

import java.util.Scanner;

public class Exr04 {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		double n1, n2, n3, n4, dif;

		n1 = Leia.nextDouble();
		n2 = Leia.nextDouble();
		n3 = Leia.nextDouble();
		n4 = Leia.nextDouble();
		
		dif = (n1 * n2) - (n3 * n4);
		System.out.println("Diferença é " + dif);

	}

}
