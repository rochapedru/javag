package aula_03;

import java.util.Scanner;

public class lista02_ex7 {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int cod;
		float n1, n2, total;
		
		cod = Leia.nextInt();
		n1 = Leia.nextFloat();
		n2 = Leia.nextFloat();

		switch (cod) {
		case 1:
			total = n1 + n2;
			System.out.printf(n1 + "+" + n2 + "=" + total);
			break;
		case 2:
			total = n1 - n2;
			System.out.printf(n1 + "-" + n2 + "=" + total);
			break;
		case 3:
			total = n1 * n2;
			System.out.printf(n1 + "*" + n2 + "=" + total);
			break;
		case 4:
			if (n2 == 0) {
				System.out.println("Nao existe divisao por 0");
			}else { 
				total = n1 / n2;
				System.out.printf(n1 + "/" + n2 + "=" + total);
				break;
				}
		}
	}
}
