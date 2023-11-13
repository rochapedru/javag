package aula_04;

import java.util.Scanner;

public class lista01_exr01 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		int n1, n2, intervalo;
		n1 = Leia.nextInt();
		n2 = Leia.nextInt();
		if (n1 < n2 ) {
			
		}else {
			System.out.println("Intervlo invalido");
		}
		for (int i = n1; i < n2; n1 ++ ) {
			i ++;
			if ( i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5 ");
				
			}
			
		}

	}

}
