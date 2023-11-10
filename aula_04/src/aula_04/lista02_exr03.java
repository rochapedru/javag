package aula_04;

import java.util.Scanner;

public class lista02_exr03 {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, menor = 0, maior = 0;
		do {
			System.out.println("Digite idade: ");
			idade = Leia.nextInt();
			if (idade < 21 && idade > 0) {
				menor ++;
			}else if (idade > 50 && idade > 0) {
				maior ++;
			}
		}while(idade != 0);
		System.out.println("Menores que 21 " + menor + " pessoas. Maiores que 51 " + maior + " pessoas");
		
	}
}