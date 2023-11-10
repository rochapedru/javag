package javag;

import java.util.Scanner;

public class rascunho {

	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, menor = 0, maior = 0;
		System.out.println("Digite idade: ");
		idade = Leia.nextInt();
		
		while(idade != 0) {
			System.out.println("Digite idade: ");
			if (idade < 21 && idade > 0) {
				menor ++;
			}else if (idade > 50 && idade > 0) {
				maior ++;
			}
			idade = Leia.nextInt();
		}
		
		System.out.println("Menores que 21 " + menor + " pessoas. Maiores que 51 " + maior + " pessoas");
	
	}
}