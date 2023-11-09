package aula_03;

import java.util.Scanner;

public class lista02_exr5 {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int cod, quant;
		double total;
		cod = Leia.nextInt();
		quant = Leia.nextInt();

		switch (cod) {
		case 1:
			total = quant * 10.00;
			System.out.printf("Dogs por: " + total);
			break;
		case 2:
			total = quant * 15.00;
			System.out.printf("Salada por: " + total);
			break;
		case 3:
			total = quant * 18.00;
			System.out.printf("Bacon por: " + total);
			break;
		case 4:
			total = quant * 12.00;
			System.out.printf("Bauru por: " + total);
			break;
		case 5:
			total = quant * 8.00;
			System.out.printf("Refri por: " + total);
			break;
		case 6:
			total = quant * 13.00;
			System.out.printf("Suco por: " + total);
			break;
		}	
	}
}
